package br.com.gonow.dojo.vraptor;

import br.com.caelum.vraptor.http.FormatResolver;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.caelum.vraptor.view.DefaultPathResolver;
import br.com.caelum.vraptor.view.PathResolver;

@Component
public class FreemarkerResolver extends DefaultPathResolver {

    public static final String EXTENSION = "ftl";

    public FreemarkerResolver(FormatResolver resolver) {
        super(resolver);
    }

    @Override
    protected String getExtension() {
        return EXTENSION;
    }

    @Override
    protected String getPrefix() {
        return "/";
    }
}
