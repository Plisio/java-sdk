/*
 * Plisio API
 * Plisio payment gateway API
 *
 * Contact: lead@plisio.net
 *
 */

package com.plisio.api;

import com.plisio.model.ErrorResponseDto;
import com.plisio.model.ShopResponseDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ShopApi
 */
@Ignore
public class ShopApiTest {

    private final ShopApi api = new ShopApi();

    /**
     * Get shop info by api_key
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void shopsGetTest() throws Exception {
        ShopResponseDto response = api.shopsGet();

        // TODO: test validations
    }
}
