package org.zerock.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.GoodVO;
import org.zerock.service.AdminService;
import org.springframework.security.core.Authentication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.zerock.model.AttachImageVO;
//import org.zerock.model.AuthorVO;
//import org.zerock.model.BookVO;
//import org.zerock.model.Criteria;
//import org.zerock.model.OrderCancelDTO;
//import org.zerock.model.OrderDTO;
//import org.zerock.model.PageDTO;
//import org.zerock.service.AdminService;
//import org.zerock.service.AuthorService;
//import org.zerock.service.OrderService;

import net.coobird.thumbnailator.Thumbnails;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="main", method = RequestMethod.GET)
	public void adminMainGET() throws Exception{
		
		logger.info("관리 페이지 이동");
	}
	/* 상품 등록 페이지 접속 */
    @RequestMapping(value = "goodregister", method = RequestMethod.GET)
    public void goodRegisterGET() throws Exception{
        logger.info("상품 등록 페이지 접속");
    }
    
    /* 상품 수정 페이지 접속 */
    @RequestMapping(value = "goodmodify", method = RequestMethod.GET)
    public void goodModifyGET() throws Exception{
        logger.info("상품 수정 페이지 접속");
    }
    
    /* 상품 삭제 페이지 접속 */
    @RequestMapping(value = "gooddelete", method = RequestMethod.GET)
    public void goodDeleteGET() throws Exception{
        logger.info("상품 삭제 페이지 접속");
    }
    
    /* 매출 관리 페이지 접속 */
    @RequestMapping(value = "salemanagement", method = RequestMethod.GET)
    public void saleManagementGET() throws Exception{
        logger.info("매출 관리 페이지 접속");
    }
    
    /* 재고 관리 페이지 접속 */
    @RequestMapping(value = "inventorymanagement", method = RequestMethod.GET)
    public void inventoryManagementGET() throws Exception{
        logger.info("재고 관리 페이지 접속");
    }
    
    /* 상품 등록 */
	@PostMapping("/goodregister")
	public String goodregisterPOST(GoodVO good, RedirectAttributes rttr) {
		
		logger.info("상품등록....." + good);
		
		adminService.goodregister(good);
		
		rttr.addFlashAttribute("good_result", good.getGoodName());
		
		return "redirect:/admin/goodregister";
	}	
}