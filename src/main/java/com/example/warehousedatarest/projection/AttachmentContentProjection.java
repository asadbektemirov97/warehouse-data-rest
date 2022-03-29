package com.example.warehousedatarest.projection;

import com.example.warehousedatarest.entity.Attachment;
import com.example.warehousedatarest.entity.AttachmentContent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "attachmentContentProjection", types = AttachmentContent.class)
public interface AttachmentContentProjection {

    Integer getId();

    @Value("#{target.attachment}")
    Attachment getAttachment();

    @Value("#{target.bytes}")
    Byte[] getBytes();

}
