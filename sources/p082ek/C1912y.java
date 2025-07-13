package p082ek;

/* renamed from: ek.y */
/* loaded from: classes.dex */
public final class C1912y {

    /* renamed from: a */
    public final java.lang.reflect.Method f8269a;

    /* renamed from: b */
    public final bi.C0803w f8270b;

    /* renamed from: c */
    public final java.lang.String f8271c;

    /* renamed from: d */
    public final java.lang.String f8272d;

    /* renamed from: e */
    public final bi.C0802v f8273e;

    /* renamed from: f */
    public final bi.C0805y f8274f;

    /* renamed from: g */
    public final boolean f8275g;

    /* renamed from: h */
    public final boolean f8276h;

    /* renamed from: i */
    public final boolean f8277i;

    /* renamed from: j */
    public final retrofit2.ParameterHandler<?>[] f8278j;

    /* renamed from: k */
    public final boolean f8279k;

    /* renamed from: ek.y$a */
    public static final class a {

        /* renamed from: x */
        public static final java.util.regex.Pattern f8280x = null;

        /* renamed from: y */
        public static final java.util.regex.Pattern f8281y = null;

        /* renamed from: a */
        public final p082ek.C1885b0 f8282a;

        /* renamed from: b */
        public final java.lang.reflect.Method f8283b;

        /* renamed from: c */
        public final java.lang.annotation.Annotation[] f8284c;

        /* renamed from: d */
        public final java.lang.annotation.Annotation[][] f8285d;

        /* renamed from: e */
        public final java.lang.reflect.Type[] f8286e;

        /* renamed from: f */
        public boolean f8287f;

        /* renamed from: g */
        public boolean f8288g;

        /* renamed from: h */
        public boolean f8289h;

        /* renamed from: i */
        public boolean f8290i;

        /* renamed from: j */
        public boolean f8291j;

        /* renamed from: k */
        public boolean f8292k;

        /* renamed from: l */
        public boolean f8293l;

        /* renamed from: m */
        public boolean f8294m;

        /* renamed from: n */
        public java.lang.String f8295n;

        /* renamed from: o */
        public boolean f8296o;

        /* renamed from: p */
        public boolean f8297p;

        /* renamed from: q */
        public boolean f8298q;

        /* renamed from: r */
        public java.lang.String f8299r;

        /* renamed from: s */
        public bi.C0802v f8300s;

        /* renamed from: t */
        public bi.C0805y f8301t;

        /* renamed from: u */
        public java.util.Set<java.lang.String> f8302u;

        /* renamed from: v */
        public retrofit2.ParameterHandler<?>[] f8303v;

        /* renamed from: w */
        public boolean f8304w;

        static {
                java.lang.String r0 = "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                p082ek.C1912y.a.f8280x = r0
                java.lang.String r0 = "[a-zA-Z][a-zA-Z0-9_-]*"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                p082ek.C1912y.a.f8281y = r0
                return
        }

        public a(p082ek.C1885b0 r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.f8282a = r1
                r0.f8283b = r2
                java.lang.annotation.Annotation[] r1 = r2.getAnnotations()
                r0.f8284c = r1
                java.lang.reflect.Type[] r1 = r2.getGenericParameterTypes()
                r0.f8286e = r1
                java.lang.annotation.Annotation[][] r1 = r2.getParameterAnnotations()
                r0.f8285d = r1
                return
        }

        /* renamed from: a */
        public static java.lang.Class<?> m4693a(java.lang.Class<?> r1) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L7
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L7:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto Le
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            Le:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L15
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L15:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L1c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L1c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L23
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L23:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L2a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L2a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L31
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L31:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L37
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L37:
                return r1
        }

        /* renamed from: b */
        public final void m4694b(java.lang.String r4, java.lang.String r5, boolean r6) {
                r3 = this;
                java.lang.String r0 = r3.f8295n
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L5e
                r3.f8295n = r4
                r3.f8296o = r6
                boolean r4 = r5.isEmpty()
                if (r4 == 0) goto L11
                return
            L11:
                r4 = 63
                int r4 = r5.indexOf(r4)
                r6 = -1
                if (r4 == r6) goto L40
                int r6 = r5.length()
                int r6 = r6 - r2
                if (r4 >= r6) goto L40
                int r4 = r4 + r2
                java.lang.String r4 = r5.substring(r4)
                java.util.regex.Pattern r6 = p082ek.C1912y.a.f8280x
                java.util.regex.Matcher r6 = r6.matcher(r4)
                boolean r6 = r6.find()
                if (r6 != 0) goto L33
                goto L40
            L33:
                java.lang.reflect.Method r5 = r3.f8283b
                java.lang.Object[] r6 = new java.lang.Object[r2]
                r6[r1] = r4
                java.lang.String r4 = "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."
                java.lang.RuntimeException r4 = p082ek.C1893f0.m4669j(r5, r4, r6)
                throw r4
            L40:
                r3.f8299r = r5
                java.util.regex.Pattern r4 = p082ek.C1912y.a.f8280x
                java.util.regex.Matcher r4 = r4.matcher(r5)
                java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
                r5.<init>()
            L4d:
                boolean r6 = r4.find()
                if (r6 == 0) goto L5b
                java.lang.String r6 = r4.group(r2)
                r5.add(r6)
                goto L4d
            L5b:
                r3.f8302u = r5
                return
            L5e:
                java.lang.reflect.Method r5 = r3.f8283b
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r1] = r0
                r6[r2] = r4
                java.lang.String r4 = "Only one HTTP method is allowed. Found: %s and %s."
                java.lang.RuntimeException r4 = p082ek.C1893f0.m4669j(r5, r4, r6)
                throw r4
        }

        /* renamed from: c */
        public final void m4695c(int r4, java.lang.reflect.Type r5) {
                r3 = this;
                boolean r0 = p082ek.C1893f0.m4667h(r5)
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.reflect.Method r0 = r3.f8283b
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.String r5 = "Parameter type must not include a type variable or wildcard: %s"
                java.lang.RuntimeException r4 = p082ek.C1893f0.m4671l(r0, r4, r5, r1)
                throw r4
        }
    }

    public C1912y(p082ek.C1912y.a r2) {
            r1 = this;
            r1.<init>()
            java.lang.reflect.Method r0 = r2.f8283b
            r1.f8269a = r0
            ek.b0 r0 = r2.f8282a
            bi.w r0 = r0.f8149c
            r1.f8270b = r0
            java.lang.String r0 = r2.f8295n
            r1.f8271c = r0
            java.lang.String r0 = r2.f8299r
            r1.f8272d = r0
            bi.v r0 = r2.f8300s
            r1.f8273e = r0
            bi.y r0 = r2.f8301t
            r1.f8274f = r0
            boolean r0 = r2.f8296o
            r1.f8275g = r0
            boolean r0 = r2.f8297p
            r1.f8276h = r0
            boolean r0 = r2.f8298q
            r1.f8277i = r0
            retrofit2.ParameterHandler<?>[] r0 = r2.f8303v
            r1.f8278j = r0
            boolean r2 = r2.f8304w
            r1.f8279k = r2
            return
    }
}
