package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Attachment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "attachmentProjection", types = Attachment.class)
public interface AttachmentProjection {

    Integer getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.contentType}")
    String getContentType();

    @Value("#{target.size}")
    long getSize();

}
