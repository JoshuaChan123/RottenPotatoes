public class Array{
    public static void main(String[] args) {
        int[][] ratings={{4,6,2,5},
                         {7,9,4,8}, 
                         {6,9,3,7}};
        System.out.println(avgRating2018(ratings));
    }

    public static int MovieAvgRating(int[][] rating, int movie){
        int total=0;
        for(int i=0; i<rating.length; i++){
            total+=rating[i][movie];
        }
        return total/rating.length;
    }

    public static int ReviewAvg(int[][] rating, int reviewer){
        int total=0;
        for(int i=0; i<rating[0].length; i++){
            total+= rating[reviewer][i];
        }
        return total/3;
    }

    public static int avgRating2018(int[][] ratings){
        int total=0;

        for(int i=0; i<ratings.length; i++){
            for(int j=0; j<ratings[i].length; j++){
                total+=ratings[i][j];
            }
        }
        return total/12;
    }

    public static int hardestRater2018(int[][] ratings){
        int lowest=100000;
        int r;
        int rev=-1;

        for(int i=0; i<ratings.length; i++){
            r=0;
            for(int j=0; j<ratings[0].length; j++){
                r+=ratings[i][j];
            }
            if(r<lowest){
                lowest=r;
                rev=i;
            }
        }
        return rev;
    }

    public static int worstMovie2018(int[][] ratings){
        int r=0;
        int lowest=10000;
        int movie=-1;

        for(int i=0; i<ratings[0].length; i++){
            for(int j=0; j<ratings.length; j++){
                r+=ratings[j][i];
            }
            if(r<lowest){
                lowest=r;
                movie=i;
            }
            r=0;
        }
        return movie;
    }
}





