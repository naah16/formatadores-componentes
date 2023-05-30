package br.edu.iftm.upt.eco.formatadoresecomponentes.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/formatadores")
public class FormatterController {

	private static final Logger logger = LoggerFactory.getLogger(FormatterController.class);
	
	@GetMapping("/htmlpuro")
	public String carregarHTMLPuro() {
		logger.trace("Entrou em carregarHTMLPuro");
		logger.trace("Encaminhando para a view htmlpuro/htmlpuro");
		return "htmlpuro/htmlpuro";
	}
	
	@GetMapping("/componentes")
	public String carregarComponentes() {
		logger.trace("Entrou em carregarComponentes");
		logger.trace("Encaminhando para a view componentes");
		return "componentes/componentes";
	}
		
	@PostMapping("/inteiro")
	public ModelAndView recebeInteiro(Integer inteiro, Locale locale) {
		logger.trace("Entrou em recebeInteiro");
		logger.debug("Integer recebido {}", inteiro);
		ModelAndView mv = new ModelAndView("htmlpuro/mostrarinteiro");
		mv.addObject("inteiro", inteiro);
		mv.addObject("locale", locale);
		logger.trace("Encaminhando para a view htmlpuro/mostrarinteiro");
		return mv;
	}
	
	@PostMapping("/bigdecimal")
	public ModelAndView recebeBigDecimal(BigDecimal bigDecimal) {
		logger.trace("Entrou em recebeBigDecimal");
		logger.debug("BigDecimal recebido {}", bigDecimal);
		ModelAndView mv = new ModelAndView("htmlpuro/mostrarbigdecimal");
		mv.addObject("bigDecimal", bigDecimal);
		logger.trace("Encaminhando para a view htmlpuro/mostrarbigdecimal");
		return mv;
	}
	
	@PostMapping("/localtime")
	public ModelAndView recebeLocalTime(LocalTime hora) {
		logger.trace("Entrou em recebeLocalTime");
		logger.debug("LocalTime recebido {}", hora);
		ModelAndView mv = new ModelAndView("htmlpuro/mostrarlocaltime");
		mv.addObject("hora", hora);
		logger.trace("Encaminhando para a view htmlpuro/mostrarlocaltime");
		return mv;
	}
	
	@PostMapping("/localdate")
	public ModelAndView recebeLocalDate(LocalDate data) {
		logger.trace("Entrou em recebeLocalDate");
		logger.debug("LocalDate recebido {}", data);
		ModelAndView mv = new ModelAndView("htmlpuro/mostrarlocaldate");
		mv.addObject("data", data);
		logger.trace("Encaminhando para a view htmlpuro/mostrarlocaldate");
		return mv;
	}
	
}
