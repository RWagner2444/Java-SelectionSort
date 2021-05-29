
/**
 * Selection Sort
 * 3/13/2021
 * Ryan Wagner
 */
public class MovieTesterV2
{
    public static void main(String[] args){
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Good Will Hunting", 1997, "Be Gentlemen");
        movies[1] = new Movie("Jumanji The Next Level", 2019, "Comumbia Pictures");
        movies[2] = new Movie("Spider Man", 2002, "Sony Pictures");
        movies[3] = new Movie("The Martian", 2015, "20th Century Fox");
        movies[4] = new Movie("Toy Story", 1995, "Pixar");
        movies[5] = new Movie("Aladin", 1992, "Disney");
        movies[6] = new Movie("Star War A New Hope", 1977, "Lucasfilm");
        movies[7] = new Movie("1917", 2019, "DreamWorks");
        movies[8] = new Movie("Iron Man", 2008, "Marvel");
        movies[9] = new Movie("Jurassic Park", 1993, "Universal Pictures");
        
        System.out.println("Original List: \n"); 
        printMovies(movies);
        
        sortMovieTitle(movies, 1);
        //sortMovieTitle(movies, 2);
        
        //sortMovieYear(movies, 1);
        //sortMovieYear(movies, 2);
        
        //sortMovieStudio(movies, 1);
        //sortMovieStudio(movies, 2);
    }
    
    public static void printMovies(Movie[] movies){
        for(Movie m: movies){
            System.out.println(m);
        }
    }
    
    public static void sortMovieTitle(Movie[] movies, int upOrDown){
        int index = 0;
        Movie altMovie = new Movie("", 0, "");
        if(upOrDown == 1){
            for(int i = movies.length - 1; i > 0; i--){
                index = 0;
                for(int m = 1; m <= i; m++){
                    if(movies[m].getTitle().compareTo(movies[index].getTitle()) > 0){
                        index = m;
                    }
                    altMovie = movies[i];
                    movies[i] = movies[index];
                    movies[index] = altMovie;
                }
            }
            System.out.println("\n\nSorted by title from a-z: \n");
            printMovies(movies);
        }
        
        if(upOrDown == 2){
            for(int i = movies.length - 1; i > 0; i--){
                index = 0;
                for(int m = 1; m <= i; m++){
                    if(movies[m].getTitle().compareTo(movies[index].getTitle()) < 0){
                        index = m;
                    }
                    altMovie = movies[i];
                    movies[i] = movies[index];
                    movies[index] = altMovie;
                }
            }
            System.out.println("\n\nSorted by title from z-a: \n");
            printMovies(movies);
        }
    }
    
    public static void sortMovieYear(Movie[] movies, int upOrDown){
        int index = 0;
        Movie[] altMovies = new Movie[movies.length];
        if(upOrDown == 1){
            for(int i = movies.length - 1; i > 0; i--){
                index = 0;
                for(int m = 1; m <= i; m++){
                    if(movies[m].getYear() > movies[index].getYear()){
                        index = m;
                    }
                    altMovies[0] = movies[i];
                    movies[i] = movies[index];
                    movies[index] = altMovies[0];
                }
            }
            System.out.println("\n\nSorted by year from oldest to newest: \n");
            printMovies(movies);
        }
        if(upOrDown == 2){
            for(int i = movies.length - 1; i > 0; i--){
                index = 0;
                for(int m = 1; m <= i; m++){
                    if(movies[m].getYear() < movies[index].getYear()){
                        index = m;
                    }
                    altMovies[0] = movies[i];
                    movies[i] = movies[index];
                    movies[index] = altMovies[0];
                }
            }
            System.out.println("\n\nSorted by year from newest to oldest: \n");
            printMovies(movies);
        }
    }
    
    public static void sortMovieStudio(Movie[] movies, int upOrDown){
         int index = 0;
        Movie[] altMovies = new Movie[movies.length];
        if(upOrDown == 1){
            for(int i = movies.length - 1; i > 0; i--){
                index = 0;
                for(int m = 1; m <= i; m++){
                    if(movies[m].getStudio().compareTo(movies[index].getStudio()) > 0){
                        index = m;
                    }
                    altMovies[0] = movies[i];
                    movies[i] = movies[index];
                    movies[index] = altMovies[0];
                }
            }
            System.out.println("\n\nSorted by studio from a-z: \n");
            printMovies(movies);
        }
        
        if(upOrDown == 2){
            for(int i = movies.length - 1; i > 0; i--){
                index = 0;
                for(int m = 1; m <= i; m++){
                    if(movies[m].getStudio().compareTo(movies[index].getStudio()) < 0){
                        index = m;
                    }
                    altMovies[0] = movies[i];
                    movies[i] = movies[index];
                    movies[index] = altMovies[0];
                }
            }
            System.out.println("\n\nSorted by studio from z-a: \n");
            printMovies(movies);
        }
    }
    
}
