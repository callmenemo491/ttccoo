package sa;

/* renamed from: sa.e */
/* loaded from: classes.dex */
public final class C6005e implements p310ra.InterfaceC5802b<sa.C6005e> {

    /* renamed from: e */
    public static final sa.C6005e.a f23139e = null;

    /* renamed from: a */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5608e<?>> f23140a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5610g<?>> f23141b;

    /* renamed from: c */
    public qa.InterfaceC5608e<java.lang.Object> f23142c;

    /* renamed from: d */
    public boolean f23143d;

    /* renamed from: sa.e$a */
    public static final class a implements qa.InterfaceC5610g<java.util.Date> {

        /* renamed from: a */
        public static final java.text.DateFormat f23144a = null;

        static {
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.util.Locale r1 = java.util.Locale.US
                java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
                r0.<init>(r2, r1)
                sa.C6005e.a.f23144a = r0
                java.lang.String r1 = "UTC"
                java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
                r0.setTimeZone(r1)
                return
        }

        public a(sa.C6004d r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // qa.InterfaceC5605b
        /* renamed from: a */
        public void mo5556a(java.lang.Object r2, qa.InterfaceC5611h r3) {
                r1 = this;
                java.util.Date r2 = (java.util.Date) r2
                qa.h r3 = (qa.InterfaceC5611h) r3
                java.text.DateFormat r0 = sa.C6005e.a.f23144a
                java.lang.String r2 = r0.format(r2)
                r3.mo7567a(r2)
                return
        }
    }

    static {
            sa.e$a r0 = new sa.e$a
            r1 = 0
            r0.<init>(r1)
            sa.C6005e.f23139e = r0
            return
    }

    public C6005e() {
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f23140a = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f23141b = r1
            sa.a r2 = sa.C6001a.f23135a
            r4.f23142c = r2
            r2 = 0
            r4.f23143d = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            sa.b r3 = sa.C6002b.f23136a
            r1.put(r2, r3)
            r0.remove(r2)
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            sa.c r3 = sa.C6003c.f23137a
            r1.put(r2, r3)
            r0.remove(r2)
            java.lang.Class<java.util.Date> r2 = java.util.Date.class
            sa.e$a r3 = sa.C6005e.f23139e
            r1.put(r2, r3)
            r0.remove(r2)
            return
    }

    /* renamed from: a */
    public p310ra.InterfaceC5802b m12486a(java.lang.Class r2, qa.InterfaceC5608e r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, qa.e<?>> r0 = r1.f23140a
            r0.put(r2, r3)
            java.util.Map<java.lang.Class<?>, qa.g<?>> r3 = r1.f23141b
            r3.remove(r2)
            return r1
    }
}
