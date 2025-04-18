package Joubaer;

import java.time.LocalDate;

public class PerformanceReview {
    public int reviewId,employeeId;
    public LocalDate reviewDate;
    public double rating;
    public String reviewName,comments;

    public PerformanceReview() {
    }

    public PerformanceReview(int reviewId, int employeeId, LocalDate reviewDate, double rating, String reviewName, String comments) {
        this.reviewId = reviewId;
        this.employeeId = employeeId;
        this.reviewDate = reviewDate;
        this.rating = rating;
        this.reviewName = reviewName;
        this.comments = comments;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PerformanceReview{" +
                "reviewId=" + reviewId +
                ", employeeId=" + employeeId +
                ", reviewDate=" + reviewDate +
                ", rating=" + rating +
                ", reviewName='" + reviewName + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
