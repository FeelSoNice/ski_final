package handler.qnaBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import handler.CommandHandler;

@Controller
public class QnaListHandler implements CommandHandler{

	@RequestMapping( "/qnaListHandler" )
	@Override
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		return new ModelAndView( "qnaBoard/qnaList" );
	}

}
