public class Book{
    
    private String Title;
    private String issn;
    private Date publicationDate;
    private Person author;

    
    public Book(String Title, String issn, Date publicationDate, Person author) {
        this.title = title;
        this.issn = issn;
        this.publicationDate = new Date(publicationDate);
        this.author = new Person(author);
    }
    
     public Book(Book other) {
        this(other.title, other.issn, other.publicationDate, other.author);
    }
    
     void showBookDetails(){
        System.out.println("Title:" +title+",ISSN:"+issn+",");
        System.out.println("Publication date:"+publicationDate);

    }
  

     boolean equals(Object obj){
     if(this==obj){
        return true;
     }
     if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return title.equals(other.title) && issn.equals(other.issn) &&    publicationDate.equals(other.publicationDate) && author.equals(other.author);
    }

    public String getline(){
        return title;
    }

    public void settitle(String title){
          this title=title;
    } 
    
    public string getIssn(){
          return issn;
   }

    public void setIssn(String issn){ 
        this.issn=issn;

   }





