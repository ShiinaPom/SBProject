b.$slides = b.$slider.children(b.options.slide + ":not(.slick-cloned)").addClass("slick-slide"), 
		b.slideCount = b.$slides.length, 
		b.$slides.each(function(b, c) {
			a(c).attr("data-slick-index", b).data("originalStyling",
					a(c).attr("style") || "")
		}), b.$slider.addClass("slick-slider"),
		b.$slideTrack = 0 === b.slideCount ? a('<div class="slick-track"/>')
				.appendTo(b.$slider) : b.$slides.wrapAll(
				'<div class="slick-track"/>').parent(), b.$list = b.$slideTrack
				.wrap('<div aria-live="polite" class="slick-list"/>').parent(),
		b.$slideTrack.css("opacity", 0),
		(b.options.centerMode === !0 || b.options.swipeToSlide === !0)
				&& (b.options.slidesToScroll = 1), a("img[data-lazy]",
				b.$slider).not("[src]").addClass("slick-loading"), b
				.setupInfinite(), b.buildArrows(), b.buildDots(), b
				.updateDots(),
		b.setSlideClasses("number" == typeof b.currentSlide ? b.currentSlide
				: 0), b.options.draggable === !0
				&& b.$list.addClass("draggable")