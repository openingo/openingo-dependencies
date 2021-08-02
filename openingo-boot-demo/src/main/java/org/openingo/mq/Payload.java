package org.openingo.mq;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * Payload
 *
 * @author Qicz
 * @since 2021/8/2 17:28
 */
@Data
public class Payload implements Serializable {

	Integer id;

	Map<String, Object> data;
}
