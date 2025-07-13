package ki;

/* renamed from: ki.c */
/* loaded from: classes.dex */
public final class C4130c {

    /* renamed from: a */
    public static final java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> f17144a = null;

    /* renamed from: b */
    public static final java.util.Map<java.lang.String, java.lang.String> f17145b = null;

    /* renamed from: c */
    public static final ki.C4130c f17146c = null;

    static {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            ki.C4130c.f17144a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<bi.a0> r1 = bi.C0771a0.class
            java.lang.Package r1 = r1.getPackage()
            if (r1 == 0) goto L19
            java.lang.String r1 = r1.getName()
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L21
            java.lang.String r2 = "OkHttp"
            r0.put(r1, r2)
        L21:
            java.lang.Class<bi.a0> r1 = bi.C0771a0.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.OkHttpClient"
            r0.put(r1, r2)
            java.lang.Class<ii.e> r1 = p154ii.C3178e.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<ei.e> r1 = p080ei.C1857e.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            java.lang.String r1 = "<this>"
            p214m2.C4339q.m9706k(r0, r1)
            int r2 = r0.size()
            if (r2 == 0) goto L65
            r3 = 1
            if (r2 == r3) goto L60
            p214m2.C4339q.m9706k(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            goto L67
        L60:
            java.util.Map r1 = p185k7.C4038x4.m9101n(r0)
            goto L67
        L65:
            dh.l r1 = p062dh.C1476l.f7238Y
        L67:
            ki.C4130c.f17145b = r1
            return
    }
}
