package self.aub.product.cgt.common;

import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;

/**
 * 分页类
 *
 * @param <T>
 */
public class Page<T> {
    private final long total;
    private final List<T> content;
    private final int pageSize;
    private final int pageNumber;

    public Page(List<T> content, int pageNumber, int pageSize) {
        this(content, pageNumber, pageSize, 0);
    }

    public Page(List<T> content, int pageNumber, int pageSize, long total) {
        Assert.notNull(content, "Content must not be null!");
        this.total = total;
        this.content = content;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public boolean isHasNext() {
        return getPageNumber() < getTotalPages();
    }

    public boolean isHasPrevious() {
        return getPageNumber() > 1;
    }

    public int getTotalPages() {
        return pageSize == 0 ? 1 : (int) Math.ceil((double) total / (double) pageSize);
    }

    public long getTotalElements() {
        return total;
    }

    public boolean isLast() {
        return !isHasNext();
    }

    public boolean isFirst() {
        return !isHasPrevious();
    }

    public int getNumberOfElements() {
        return content.size();
    }

    public boolean isHasContent() {
        return !content.isEmpty();
    }

    public List<T> getPageContent() {
        return Collections.unmodifiableList(content);
    }
}
