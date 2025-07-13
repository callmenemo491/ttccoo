package p082ek;

/* renamed from: ek.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC1887c0<T> {
    public AbstractC1887c0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: b */
    public static <T> p082ek.AbstractC1887c0<T> m4656b(p082ek.C1885b0 r24, java.lang.reflect.Method r25) {
            r0 = r24
            r1 = r25
            ek.y$a r2 = new ek.y$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.f8284c
            int r4 = r3.length
            r5 = 0
            r6 = 0
        Le:
            java.lang.String r7 = "HEAD"
            r8 = 1
            if (r6 >= r4) goto L13b
            r9 = r3[r6]
            boolean r10 = r9 instanceof p115gk.InterfaceC2406b
            if (r10 == 0) goto L27
            gk.b r9 = (p115gk.InterfaceC2406b) r9
            java.lang.String r7 = r9.value()
            java.lang.String r8 = "DELETE"
        L21:
            r23 = r8
            r8 = r7
            r7 = r23
            goto L77
        L27:
            boolean r10 = r9 instanceof p115gk.InterfaceC2410f
            if (r10 == 0) goto L34
            gk.f r9 = (p115gk.InterfaceC2410f) r9
            java.lang.String r7 = r9.value()
            java.lang.String r8 = "GET"
            goto L21
        L34:
            boolean r10 = r9 instanceof p115gk.InterfaceC2411g
            if (r10 == 0) goto L3f
            gk.g r9 = (p115gk.InterfaceC2411g) r9
            java.lang.String r8 = r9.value()
            goto L77
        L3f:
            boolean r7 = r9 instanceof p115gk.InterfaceC2418n
            if (r7 == 0) goto L4c
            gk.n r9 = (p115gk.InterfaceC2418n) r9
            java.lang.String r7 = r9.value()
            java.lang.String r9 = "PATCH"
            goto L65
        L4c:
            boolean r7 = r9 instanceof p115gk.InterfaceC2419o
            if (r7 == 0) goto L59
            gk.o r9 = (p115gk.InterfaceC2419o) r9
            java.lang.String r7 = r9.value()
            java.lang.String r9 = "POST"
            goto L65
        L59:
            boolean r7 = r9 instanceof p115gk.InterfaceC2420p
            if (r7 == 0) goto L6a
            gk.p r9 = (p115gk.InterfaceC2420p) r9
            java.lang.String r7 = r9.value()
            java.lang.String r9 = "PUT"
        L65:
            r2.m4694b(r9, r7, r8)
            goto L137
        L6a:
            boolean r7 = r9 instanceof p115gk.InterfaceC2417m
            if (r7 == 0) goto L7c
            gk.m r9 = (p115gk.InterfaceC2417m) r9
            java.lang.String r7 = r9.value()
            java.lang.String r8 = "OPTIONS"
            goto L21
        L77:
            r2.m4694b(r7, r8, r5)
            goto L137
        L7c:
            boolean r7 = r9 instanceof p115gk.InterfaceC2412h
            if (r7 == 0) goto L93
            gk.h r9 = (p115gk.InterfaceC2412h) r9
            java.lang.String r7 = r9.method()
            java.lang.String r8 = r9.path()
            boolean r9 = r9.hasBody()
            r2.m4694b(r7, r8, r9)
            goto L137
        L93:
            boolean r7 = r9 instanceof p115gk.InterfaceC2415k
            if (r7 == 0) goto L10d
            gk.k r9 = (p115gk.InterfaceC2415k) r9
            java.lang.String[] r7 = r9.value()
            int r9 = r7.length
            if (r9 == 0) goto L102
            bi.v$a r9 = new bi.v$a
            r9.<init>()
            int r10 = r7.length
            r11 = 0
        La7:
            if (r11 >= r10) goto Lfb
            r12 = r7[r11]
            r13 = 58
            int r13 = r12.indexOf(r13)
            r14 = -1
            if (r13 == r14) goto Lee
            if (r13 == 0) goto Lee
            int r14 = r12.length()
            int r14 = r14 - r8
            if (r13 == r14) goto Lee
            java.lang.String r14 = r12.substring(r5, r13)
            int r13 = r13 + 1
            java.lang.String r12 = r12.substring(r13)
            java.lang.String r12 = r12.trim()
            java.lang.String r13 = "Content-Type"
            boolean r13 = r13.equalsIgnoreCase(r14)
            if (r13 == 0) goto Le8
            bi.y r13 = bi.C0805y.m2457b(r12)     // Catch: java.lang.IllegalArgumentException -> Lda
            r2.f8301t = r13     // Catch: java.lang.IllegalArgumentException -> Lda
            goto Leb
        Lda:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r5] = r12
            java.lang.String r3 = "Malformed content type: %s"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4670k(r1, r0, r3, r2)
            throw r0
        Le8:
            r9.m2432a(r14, r12)
        Leb:
            int r11 = r11 + 1
            goto La7
        Lee:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r5] = r12
            java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        Lfb:
            bi.v r7 = r9.m2434c()
            r2.f8300s = r7
            goto L137
        L102:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        L10d:
            boolean r7 = r9 instanceof p115gk.InterfaceC2416l
            java.lang.String r10 = "Only one encoding annotation is allowed."
            if (r7 == 0) goto L123
            boolean r7 = r2.f8297p
            if (r7 != 0) goto L11a
            r2.f8298q = r8
            goto L137
        L11a:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r10, r1)
            throw r0
        L123:
            boolean r7 = r9 instanceof p115gk.InterfaceC2409e
            if (r7 == 0) goto L137
            boolean r7 = r2.f8298q
            if (r7 != 0) goto L12e
            r2.f8297p = r8
            goto L137
        L12e:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r10, r1)
            throw r0
        L137:
            int r6 = r6 + 1
            goto Le
        L13b:
            java.lang.String r3 = r2.f8295n
            if (r3 == 0) goto Lafb
            boolean r3 = r2.f8296o
            if (r3 != 0) goto L162
            boolean r3 = r2.f8298q
            if (r3 != 0) goto L157
            boolean r3 = r2.f8297p
            if (r3 != 0) goto L14c
            goto L162
        L14c:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        L157:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        L162:
            java.lang.annotation.Annotation[][] r3 = r2.f8285d
            int r3 = r3.length
            ek.t[] r4 = new p082ek.AbstractC1907t[r3]
            r2.f8303v = r4
            int r4 = r3 + (-1)
            r5 = 0
        L16c:
            if (r5 >= r3) goto L969
            retrofit2.ParameterHandler<?>[] r6 = r2.f8303v
            java.lang.reflect.Type[] r8 = r2.f8286e
            r14 = r8[r5]
            java.lang.annotation.Annotation[][] r8 = r2.f8285d
            r15 = r8[r5]
            if (r5 != r4) goto L17e
            r8 = 1
            r16 = 1
            goto L181
        L17e:
            r8 = 0
            r16 = 0
        L181:
            if (r15 == 0) goto L939
            int r13 = r15.length
            r8 = 0
            r9 = 0
            r17 = r9
            r12 = 0
        L189:
            if (r12 >= r13) goto L934
            r8 = r15[r12]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class<bi.z$b> r10 = bi.C0806z.b.class
            boolean r11 = r8 instanceof p115gk.InterfaceC2429y
            r18 = r3
            java.lang.String r3 = "@Path parameters may not be used with @Url."
            if (r11 == 0) goto L23b
            r2.m4695c(r5, r14)
            boolean r8 = r2.f8294m
            if (r8 != 0) goto L22f
            boolean r8 = r2.f8290i
            if (r8 != 0) goto L225
            boolean r3 = r2.f8291j
            if (r3 != 0) goto L219
            boolean r3 = r2.f8292k
            if (r3 != 0) goto L20d
            boolean r3 = r2.f8293l
            if (r3 != 0) goto L201
            java.lang.String r3 = r2.f8299r
            if (r3 != 0) goto L1f0
            r3 = 1
            r2.f8294m = r3
            java.lang.Class<bi.w> r3 = bi.C0803w.class
            if (r14 == r3) goto L1e1
            if (r14 == r9) goto L1e1
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            if (r14 == r3) goto L1e1
            boolean r3 = r14 instanceof java.lang.Class
            if (r3 == 0) goto L1d5
            java.lang.String r3 = "android.net.Uri"
            r8 = r14
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.String r8 = r8.getName()
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L1d5
            goto L1e1
        L1d5:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r2, r1)
            throw r0
        L1e1:
            ek.t$n r3 = new ek.t$n
            java.lang.reflect.Method r8 = r2.f8283b
            r3.<init>(r8, r5)
            r19 = r4
            r21 = r12
            r20 = r13
            goto L915
        L1f0:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f8295n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "@Url cannot be used with @%s URL"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r2, r1)
            throw r0
        L201:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryMap."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L20d:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryName."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L219:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @Query."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L225:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r3, r0)
            throw r0
        L22f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Url method annotations found."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L23b:
            boolean r11 = r8 instanceof p115gk.InterfaceC2423s
            r19 = r4
            r4 = 2
            if (r11 == 0) goto L2fb
            r2.m4695c(r5, r14)
            boolean r9 = r2.f8291j
            if (r9 != 0) goto L2ef
            boolean r9 = r2.f8292k
            if (r9 != 0) goto L2e3
            boolean r9 = r2.f8293l
            if (r9 != 0) goto L2d7
            boolean r9 = r2.f8294m
            if (r9 != 0) goto L2cd
            java.lang.String r3 = r2.f8299r
            if (r3 == 0) goto L2bc
            r3 = 1
            r2.f8290i = r3
            gk.s r8 = (p115gk.InterfaceC2423s) r8
            java.lang.String r11 = r8.value()
            java.util.regex.Pattern r3 = p082ek.C1912y.a.f8281y
            java.util.regex.Matcher r3 = r3.matcher(r11)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L2a5
            java.util.Set<java.lang.String> r3 = r2.f8302u
            boolean r3 = r3.contains(r11)
            if (r3 == 0) goto L292
            ek.b0 r3 = r2.f8282a
            r3.m4652e(r14, r15)
            ek.a$d r3 = p082ek.C1882a.d.f8140a
            ek.t$i r4 = new ek.t$i
            java.lang.reflect.Method r9 = r2.f8283b
            boolean r20 = r8.encoded()
            r8 = r4
            r10 = r5
            r21 = r12
            r12 = r3
            r3 = r13
            r13 = r20
            r8.<init>(r9, r10, r11, r12, r13)
            goto L6f3
        L292:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r2.f8299r
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r11
            java.lang.String r2 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r2, r1)
            throw r0
        L2a5:
            r0 = 0
            r1 = 1
            java.lang.reflect.Method r2 = r2.f8283b
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.util.regex.Pattern r4 = p082ek.C1912y.a.f8280x
            java.lang.String r4 = r4.pattern()
            r3[r0] = r4
            r3[r1] = r11
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r2, r5, r0, r3)
            throw r0
        L2bc:
            r0 = 0
            r1 = 1
            java.lang.reflect.Method r3 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f8295n
            r1[r0] = r2
            java.lang.String r0 = "@Path can only be used with relative url on @%s"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r3, r5, r0, r1)
            throw r0
        L2cd:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r3, r0)
            throw r0
        L2d7:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryMap."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L2e3:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryName."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L2ef:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @Query."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L2fb:
            r21 = r12
            r3 = r13
            boolean r4 = r8 instanceof p115gk.InterfaceC2424t
            java.lang.String r11 = "<String>)"
            java.lang.String r12 = " must include generic type (e.g., "
            if (r4 == 0) goto L383
            r2.m4695c(r5, r14)
            gk.t r8 = (p115gk.InterfaceC2424t) r8
            java.lang.String r4 = r8.value()
            boolean r8 = r8.encoded()
            java.lang.Class r9 = p082ek.C1893f0.m4665f(r14)
            r10 = 1
            r2.f8291j = r10
            java.lang.Class<java.lang.Iterable> r10 = java.lang.Iterable.class
            boolean r10 = r10.isAssignableFrom(r9)
            if (r10 == 0) goto L354
            boolean r10 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r10 == 0) goto L341
            r9 = r14
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            r10 = 0
            java.lang.reflect.Type r9 = p082ek.C1893f0.m4664e(r10, r9)
            ek.b0 r10 = r2.f8282a
            r10.m4652e(r9, r15)
            ek.a$d r9 = p082ek.C1882a.d.f8140a
            ek.t$j r10 = new ek.t$j
            r10.<init>(r4, r9, r8)
            ek.r r4 = new ek.r
            r4.<init>(r10)
            goto L6f3
        L341:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p082ek.C1910w.m4691a(r9, r1, r12, r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L354:
            boolean r10 = r9.isArray()
            if (r10 == 0) goto L375
            java.lang.Class r9 = r9.getComponentType()
            java.lang.Class r9 = p082ek.C1912y.a.m4693a(r9)
            ek.b0 r10 = r2.f8282a
            r10.m4652e(r9, r15)
            ek.a$d r9 = p082ek.C1882a.d.f8140a
            ek.t$j r10 = new ek.t$j
            r10.<init>(r4, r9, r8)
            ek.s r4 = new ek.s
            r4.<init>(r10)
            goto L6f3
        L375:
            ek.b0 r9 = r2.f8282a
            r9.m4652e(r14, r15)
            ek.a$d r9 = p082ek.C1882a.d.f8140a
            ek.t$j r10 = new ek.t$j
            r10.<init>(r4, r9, r8)
            goto L5d8
        L383:
            boolean r4 = r8 instanceof p115gk.InterfaceC2426v
            if (r4 == 0) goto L403
            r2.m4695c(r5, r14)
            gk.v r8 = (p115gk.InterfaceC2426v) r8
            boolean r4 = r8.encoded()
            java.lang.Class r8 = p082ek.C1893f0.m4665f(r14)
            r9 = 1
            r2.f8292k = r9
            java.lang.Class<java.lang.Iterable> r9 = java.lang.Iterable.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 == 0) goto L3d1
            boolean r9 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r9 == 0) goto L3be
            r8 = r14
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            r9 = 0
            java.lang.reflect.Type r8 = p082ek.C1893f0.m4664e(r9, r8)
            ek.b0 r9 = r2.f8282a
            r9.m4652e(r8, r15)
            ek.a$d r8 = p082ek.C1882a.d.f8140a
            ek.t$l r9 = new ek.t$l
            r9.<init>(r8, r4)
            ek.r r4 = new ek.r
            r4.<init>(r9)
            goto L6f3
        L3be:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p082ek.C1910w.m4691a(r8, r1, r12, r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L3d1:
            boolean r9 = r8.isArray()
            if (r9 == 0) goto L3f2
            java.lang.Class r8 = r8.getComponentType()
            java.lang.Class r8 = p082ek.C1912y.a.m4693a(r8)
            ek.b0 r9 = r2.f8282a
            r9.m4652e(r8, r15)
            ek.a$d r8 = p082ek.C1882a.d.f8140a
            ek.t$l r9 = new ek.t$l
            r9.<init>(r8, r4)
            ek.s r4 = new ek.s
            r4.<init>(r9)
            goto L6f3
        L3f2:
            ek.b0 r8 = r2.f8282a
            r8.m4652e(r14, r15)
            ek.a$d r8 = p082ek.C1882a.d.f8140a
            ek.t$l r9 = new ek.t$l
            r9.<init>(r8, r4)
        L3fe:
            r20 = r3
            r3 = r9
            goto L915
        L403:
            boolean r4 = r8 instanceof p115gk.InterfaceC2425u
            java.lang.String r13 = "Map must include generic types (e.g., Map<String, String>)"
            if (r4 == 0) goto L46d
            r2.m4695c(r5, r14)
            java.lang.Class r4 = p082ek.C1893f0.m4665f(r14)
            r10 = 1
            r2.f8293l = r10
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            boolean r11 = r11.isAssignableFrom(r4)
            if (r11 == 0) goto L461
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            java.lang.reflect.Type r4 = p082ek.C1893f0.m4666g(r14, r4, r11)
            boolean r11 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L457
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r11 = 0
            java.lang.reflect.Type r11 = p082ek.C1893f0.m4664e(r11, r4)
            if (r9 != r11) goto L447
            java.lang.reflect.Type r4 = p082ek.C1893f0.m4664e(r10, r4)
            ek.b0 r9 = r2.f8282a
            r9.m4652e(r4, r15)
            ek.a$d r4 = p082ek.C1882a.d.f8140a
            ek.t$k r9 = new ek.t$k
            java.lang.reflect.Method r10 = r2.f8283b
            gk.u r8 = (p115gk.InterfaceC2425u) r8
            boolean r8 = r8.encoded()
            r9.<init>(r10, r5, r4, r8)
            goto L3fe
        L447:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.String r1 = "@QueryMap keys must be of type String: "
            java.lang.String r1 = p082ek.C1911x.m4692a(r1, r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L457:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r13, r0)
            throw r0
        L461:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L46d:
            boolean r4 = r8 instanceof p115gk.InterfaceC2413i
            if (r4 == 0) goto L4e7
            r2.m4695c(r5, r14)
            gk.i r8 = (p115gk.InterfaceC2413i) r8
            java.lang.String r4 = r8.value()
            java.lang.Class r8 = p082ek.C1893f0.m4665f(r14)
            java.lang.Class<java.lang.Iterable> r9 = java.lang.Iterable.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 == 0) goto L4b8
            boolean r9 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r9 == 0) goto L4a5
            r8 = r14
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            r9 = 0
            java.lang.reflect.Type r8 = p082ek.C1893f0.m4664e(r9, r8)
            ek.b0 r9 = r2.f8282a
            r9.m4652e(r8, r15)
            ek.a$d r8 = p082ek.C1882a.d.f8140a
            ek.t$d r9 = new ek.t$d
            r9.<init>(r4, r8)
            ek.r r4 = new ek.r
            r4.<init>(r9)
            goto L6f3
        L4a5:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p082ek.C1910w.m4691a(r8, r1, r12, r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L4b8:
            boolean r9 = r8.isArray()
            if (r9 == 0) goto L4d9
            java.lang.Class r8 = r8.getComponentType()
            java.lang.Class r8 = p082ek.C1912y.a.m4693a(r8)
            ek.b0 r9 = r2.f8282a
            r9.m4652e(r8, r15)
            ek.a$d r8 = p082ek.C1882a.d.f8140a
            ek.t$d r9 = new ek.t$d
            r9.<init>(r4, r8)
            ek.s r4 = new ek.s
            r4.<init>(r9)
            goto L6f3
        L4d9:
            ek.b0 r8 = r2.f8282a
            r8.m4652e(r14, r15)
            ek.a$d r8 = p082ek.C1882a.d.f8140a
            ek.t$d r9 = new ek.t$d
            r9.<init>(r4, r8)
            goto L3fe
        L4e7:
            boolean r4 = r8 instanceof p115gk.InterfaceC2414j
            if (r4 == 0) goto L555
            java.lang.Class<bi.v> r4 = bi.C0802v.class
            if (r14 != r4) goto L4f8
            ek.t$f r4 = new ek.t$f
            java.lang.reflect.Method r8 = r2.f8283b
            r4.<init>(r8, r5)
            goto L6f3
        L4f8:
            r2.m4695c(r5, r14)
            java.lang.Class r4 = p082ek.C1893f0.m4665f(r14)
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            boolean r8 = r8.isAssignableFrom(r4)
            if (r8 == 0) goto L549
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            java.lang.reflect.Type r4 = p082ek.C1893f0.m4666g(r14, r4, r8)
            boolean r8 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r8 == 0) goto L53f
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r8 = 0
            java.lang.reflect.Type r8 = p082ek.C1893f0.m4664e(r8, r4)
            if (r9 != r8) goto L52f
            r8 = 1
            java.lang.reflect.Type r4 = p082ek.C1893f0.m4664e(r8, r4)
            ek.b0 r8 = r2.f8282a
            r8.m4652e(r4, r15)
            ek.a$d r4 = p082ek.C1882a.d.f8140a
            ek.t$e r8 = new ek.t$e
            java.lang.reflect.Method r9 = r2.f8283b
            r8.<init>(r9, r5, r4)
            goto L6a7
        L52f:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.String r1 = "@HeaderMap keys must be of type String: "
            java.lang.String r1 = p082ek.C1911x.m4692a(r1, r8)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L53f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r13, r0)
            throw r0
        L549:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@HeaderMap parameter type must be Map."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L555:
            boolean r4 = r8 instanceof p115gk.InterfaceC2407c
            if (r4 == 0) goto L5e9
            r2.m4695c(r5, r14)
            boolean r4 = r2.f8297p
            if (r4 == 0) goto L5dd
            gk.c r8 = (p115gk.InterfaceC2407c) r8
            java.lang.String r4 = r8.value()
            boolean r8 = r8.encoded()
            r9 = 1
            r2.f8287f = r9
            java.lang.Class r9 = p082ek.C1893f0.m4665f(r14)
            java.lang.Class<java.lang.Iterable> r10 = java.lang.Iterable.class
            boolean r10 = r10.isAssignableFrom(r9)
            if (r10 == 0) goto L5ab
            boolean r10 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r10 == 0) goto L598
            r9 = r14
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            r10 = 0
            java.lang.reflect.Type r9 = p082ek.C1893f0.m4664e(r10, r9)
            ek.b0 r10 = r2.f8282a
            r10.m4652e(r9, r15)
            ek.a$d r9 = p082ek.C1882a.d.f8140a
            ek.t$b r10 = new ek.t$b
            r10.<init>(r4, r9, r8)
            ek.r r4 = new ek.r
            r4.<init>(r10)
            goto L6f3
        L598:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p082ek.C1910w.m4691a(r9, r1, r12, r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L5ab:
            boolean r10 = r9.isArray()
            if (r10 == 0) goto L5cc
            java.lang.Class r9 = r9.getComponentType()
            java.lang.Class r9 = p082ek.C1912y.a.m4693a(r9)
            ek.b0 r10 = r2.f8282a
            r10.m4652e(r9, r15)
            ek.a$d r9 = p082ek.C1882a.d.f8140a
            ek.t$b r10 = new ek.t$b
            r10.<init>(r4, r9, r8)
            ek.s r4 = new ek.s
            r4.<init>(r10)
            goto L6f3
        L5cc:
            ek.b0 r9 = r2.f8282a
            r9.m4652e(r14, r15)
            ek.a$d r9 = p082ek.C1882a.d.f8140a
            ek.t$b r10 = new ek.t$b
            r10.<init>(r4, r9, r8)
        L5d8:
            r20 = r3
            r3 = r10
            goto L915
        L5dd:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r2, r1)
            throw r0
        L5e9:
            boolean r4 = r8 instanceof p115gk.InterfaceC2408d
            if (r4 == 0) goto L662
            r2.m4695c(r5, r14)
            boolean r4 = r2.f8297p
            if (r4 == 0) goto L656
            java.lang.Class r4 = p082ek.C1893f0.m4665f(r14)
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            boolean r10 = r10.isAssignableFrom(r4)
            if (r10 == 0) goto L64a
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            java.lang.reflect.Type r4 = p082ek.C1893f0.m4666g(r14, r4, r10)
            boolean r10 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r10 == 0) goto L640
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r10 = 0
            java.lang.reflect.Type r10 = p082ek.C1893f0.m4664e(r10, r4)
            if (r9 != r10) goto L630
            r9 = 1
            java.lang.reflect.Type r4 = p082ek.C1893f0.m4664e(r9, r4)
            ek.b0 r10 = r2.f8282a
            r10.m4652e(r4, r15)
            ek.a$d r4 = p082ek.C1882a.d.f8140a
            r2.f8287f = r9
            ek.t$c r9 = new ek.t$c
            java.lang.reflect.Method r10 = r2.f8283b
            gk.d r8 = (p115gk.InterfaceC2408d) r8
            boolean r8 = r8.encoded()
            r9.<init>(r10, r5, r4, r8)
            goto L3fe
        L630:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.String r1 = "@FieldMap keys must be of type String: "
            java.lang.String r1 = p082ek.C1911x.m4692a(r1, r10)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L640:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r13, r0)
            throw r0
        L64a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L656:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L662:
            boolean r4 = r8 instanceof p115gk.InterfaceC2421q
            if (r4 == 0) goto L7dd
            r2.m4695c(r5, r14)
            boolean r4 = r2.f8298q
            if (r4 == 0) goto L7d1
            gk.q r8 = (p115gk.InterfaceC2421q) r8
            r4 = 1
            r2.f8288g = r4
            java.lang.String r4 = r8.value()
            java.lang.Class r9 = p082ek.C1893f0.m4665f(r14)
            boolean r13 = r4.isEmpty()
            if (r13 == 0) goto L701
            java.lang.Class<java.lang.Iterable> r4 = java.lang.Iterable.class
            boolean r4 = r4.isAssignableFrom(r9)
            java.lang.String r8 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r4 == 0) goto L6c8
            boolean r4 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L6b5
            r4 = r14
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r9 = 0
            java.lang.reflect.Type r4 = p082ek.C1893f0.m4664e(r9, r4)
            java.lang.Class r4 = p082ek.C1893f0.m4665f(r4)
            boolean r4 = r10.isAssignableFrom(r4)
            if (r4 == 0) goto L6ac
            ek.t$m r4 = p082ek.AbstractC1907t.m.f8246a
            ek.r r8 = new ek.r
            r8.<init>(r4)
        L6a7:
            r20 = r3
            r3 = r8
            goto L915
        L6ac:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r8, r1)
            throw r0
        L6b5:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p082ek.C1910w.m4691a(r9, r1, r12, r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L6c8:
            boolean r4 = r9.isArray()
            if (r4 == 0) goto L6ea
            java.lang.Class r4 = r9.getComponentType()
            boolean r4 = r10.isAssignableFrom(r4)
            if (r4 == 0) goto L6e0
            ek.t$m r4 = p082ek.AbstractC1907t.m.f8246a
            ek.s r8 = new ek.s
            r8.<init>(r4)
            goto L6a7
        L6e0:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r8, r1)
            throw r0
        L6ea:
            r4 = 0
            boolean r9 = r10.isAssignableFrom(r9)
            if (r9 == 0) goto L6f8
            ek.t$m r4 = p082ek.AbstractC1907t.m.f8246a
        L6f3:
            r20 = r3
        L6f5:
            r3 = r4
            goto L915
        L6f8:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r8, r1)
            throw r0
        L701:
            r13 = 4
            java.lang.String[] r13 = new java.lang.String[r13]
            java.lang.String r22 = "Content-Disposition"
            r20 = 0
            r13[r20] = r22
            r20 = r3
            java.lang.String r3 = "form-data; name=\""
            java.lang.String r1 = "\""
            java.lang.String r1 = android.support.v4.media.C0145d.m257a(r3, r4, r1)
            r3 = 1
            r13[r3] = r1
            java.lang.String r1 = "Content-Transfer-Encoding"
            r3 = 2
            r13[r3] = r1
            r1 = 3
            java.lang.String r3 = r8.encoding()
            r13[r1] = r3
            bi.v$b r1 = bi.C0802v.f4340Z
            bi.v r1 = r1.m2438c(r13)
            java.lang.Class<java.lang.Iterable> r3 = java.lang.Iterable.class
            boolean r3 = r3.isAssignableFrom(r9)
            java.lang.String r4 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r3 == 0) goto L77c
            boolean r3 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L769
            r3 = r14
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r8 = 0
            java.lang.reflect.Type r3 = p082ek.C1893f0.m4664e(r8, r3)
            java.lang.Class r8 = p082ek.C1893f0.m4665f(r3)
            boolean r8 = r10.isAssignableFrom(r8)
            if (r8 != 0) goto L75f
            ek.b0 r4 = r2.f8282a
            java.lang.annotation.Annotation[] r8 = r2.f8284c
            ek.f r3 = r4.m4650c(r3, r15, r8)
            ek.t$g r4 = new ek.t$g
            java.lang.reflect.Method r8 = r2.f8283b
            r4.<init>(r8, r5, r1, r3)
            ek.r r3 = new ek.r
            r3.<init>(r4)
            goto L915
        L75f:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r4, r1)
            throw r0
        L769:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = p082ek.C1910w.m4691a(r9, r1, r12, r11)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L77c:
            boolean r3 = r9.isArray()
            if (r3 == 0) goto L7b0
            java.lang.Class r3 = r9.getComponentType()
            java.lang.Class r3 = p082ek.C1912y.a.m4693a(r3)
            boolean r8 = r10.isAssignableFrom(r3)
            if (r8 != 0) goto L7a6
            ek.b0 r4 = r2.f8282a
            java.lang.annotation.Annotation[] r8 = r2.f8284c
            ek.f r3 = r4.m4650c(r3, r15, r8)
            ek.t$g r4 = new ek.t$g
            java.lang.reflect.Method r8 = r2.f8283b
            r4.<init>(r8, r5, r1, r3)
            ek.s r3 = new ek.s
            r3.<init>(r4)
            goto L915
        L7a6:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r4, r1)
            throw r0
        L7b0:
            boolean r3 = r10.isAssignableFrom(r9)
            if (r3 != 0) goto L7c7
            ek.b0 r3 = r2.f8282a
            java.lang.annotation.Annotation[] r4 = r2.f8284c
            ek.f r3 = r3.m4650c(r14, r15, r4)
            ek.t$g r4 = new ek.t$g
            java.lang.reflect.Method r8 = r2.f8283b
            r4.<init>(r8, r5, r1, r3)
            goto L6f5
        L7c7:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r4, r1)
            throw r0
        L7d1:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L7dd:
            r20 = r3
            boolean r1 = r8 instanceof p115gk.InterfaceC2422r
            if (r1 == 0) goto L870
            r2.m4695c(r5, r14)
            boolean r1 = r2.f8298q
            if (r1 == 0) goto L864
            r1 = 1
            r2.f8288g = r1
            java.lang.Class r1 = p082ek.C1893f0.m4665f(r14)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L858
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = p082ek.C1893f0.m4666g(r14, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L84e
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = p082ek.C1893f0.m4664e(r3, r1)
            if (r9 != r3) goto L83e
            r3 = 1
            java.lang.reflect.Type r1 = p082ek.C1893f0.m4664e(r3, r1)
            java.lang.Class r3 = p082ek.C1893f0.m4665f(r1)
            boolean r3 = r10.isAssignableFrom(r3)
            if (r3 != 0) goto L832
            ek.b0 r3 = r2.f8282a
            java.lang.annotation.Annotation[] r4 = r2.f8284c
            ek.f r1 = r3.m4650c(r1, r15, r4)
            gk.r r8 = (p115gk.InterfaceC2422r) r8
            ek.t$h r3 = new ek.t$h
            java.lang.reflect.Method r4 = r2.f8283b
            java.lang.String r8 = r8.encoding()
            r3.<init>(r4, r5, r1, r8)
            goto L915
        L832:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r2, r1)
            throw r0
        L83e:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.String r2 = "@PartMap keys must be of type String: "
            java.lang.String r2 = p082ek.C1911x.m4692a(r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L84e:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r13, r0)
            throw r0
        L858:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L864:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L870:
            boolean r1 = r8 instanceof p115gk.InterfaceC2405a
            if (r1 == 0) goto L8bf
            r2.m4695c(r5, r14)
            boolean r1 = r2.f8297p
            if (r1 != 0) goto L8b3
            boolean r1 = r2.f8298q
            if (r1 != 0) goto L8b3
            boolean r1 = r2.f8289h
            if (r1 != 0) goto L8a7
            ek.b0 r1 = r2.f8282a     // Catch: java.lang.RuntimeException -> L897
            java.lang.annotation.Annotation[] r3 = r2.f8284c     // Catch: java.lang.RuntimeException -> L897
            ek.f r1 = r1.m4650c(r14, r15, r3)     // Catch: java.lang.RuntimeException -> L897
            r3 = 1
            r2.f8289h = r3
            ek.t$a r3 = new ek.t$a
            java.lang.reflect.Method r4 = r2.f8283b
            r3.<init>(r4, r5, r1)
            goto L915
        L897:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f8283b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r14
            java.lang.String r3 = "Unable to create @Body converter for %s"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4672m(r1, r0, r5, r3, r2)
            throw r0
        L8a7:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L8b3:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r1, r5, r2, r0)
            throw r0
        L8bf:
            boolean r1 = r8 instanceof p115gk.InterfaceC2428x
            if (r1 == 0) goto L914
            r2.m4695c(r5, r14)
            java.lang.Class r1 = p082ek.C1893f0.m4665f(r14)
            int r3 = r5 + (-1)
        L8cc:
            if (r3 < 0) goto L90e
            retrofit2.ParameterHandler<?>[] r4 = r2.f8303v
            r4 = r4[r3]
            boolean r8 = r4 instanceof p082ek.AbstractC1907t.o
            if (r8 == 0) goto L90b
            ek.t$o r4 = (p082ek.AbstractC1907t.o) r4
            java.lang.Class<T> r4 = r4.f8249a
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L8e1
            goto L90b
        L8e1:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.String r2 = "@Tag type "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r1 = " is duplicate of parameter #"
            r2.append(r1)
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r1 = " and would always overwrite its value."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r1, r2)
            throw r0
        L90b:
            int r3 = r3 + (-1)
            goto L8cc
        L90e:
            ek.t$o r3 = new ek.t$o
            r3.<init>(r1)
            goto L915
        L914:
            r3 = 0
        L915:
            if (r3 != 0) goto L918
            goto L91c
        L918:
            if (r17 != 0) goto L928
            r17 = r3
        L91c:
            int r12 = r21 + 1
            r1 = r25
            r3 = r18
            r4 = r19
            r13 = r20
            goto L189
        L928:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r2, r1)
            throw r0
        L934:
            r18 = r3
            r19 = r4
            goto L93f
        L939:
            r18 = r3
            r19 = r4
            r17 = 0
        L93f:
            if (r17 != 0) goto L95d
            if (r16 == 0) goto L951
            java.lang.Class r1 = p082ek.C1893f0.m4665f(r14)     // Catch: java.lang.NoClassDefFoundError -> L951
            java.lang.Class<fh.d> r3 = p101fh.InterfaceC2172d.class
            if (r1 != r3) goto L951
            r1 = 1
            r2.f8304w = r1     // Catch: java.lang.NoClassDefFoundError -> L951
            r17 = 0
            goto L95d
        L951:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4671l(r0, r5, r2, r1)
            throw r0
        L95d:
            r6[r5] = r17
            int r5 = r5 + 1
            r1 = r25
            r3 = r18
            r4 = r19
            goto L16c
        L969:
            java.lang.String r1 = r2.f8299r
            if (r1 != 0) goto L983
            boolean r1 = r2.f8294m
            if (r1 == 0) goto L972
            goto L983
        L972:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f8295n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        L983:
            boolean r1 = r2.f8297p
            if (r1 != 0) goto L9a0
            boolean r3 = r2.f8298q
            if (r3 != 0) goto L9a0
            boolean r3 = r2.f8296o
            if (r3 != 0) goto L9a0
            boolean r3 = r2.f8289h
            if (r3 != 0) goto L994
            goto L9a0
        L994:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Non-body HTTP method cannot contain @Body."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        L9a0:
            if (r1 == 0) goto L9b3
            boolean r1 = r2.f8287f
            if (r1 == 0) goto L9a7
            goto L9b3
        L9a7:
            java.lang.reflect.Method r0 = r2.f8283b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Form-encoded method must contain at least one @Field."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        L9b3:
            r1 = 0
            boolean r3 = r2.f8298q
            if (r3 == 0) goto L9c8
            boolean r3 = r2.f8288g
            if (r3 == 0) goto L9bd
            goto L9c8
        L9bd:
            java.lang.reflect.Method r0 = r2.f8283b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multipart method must contain at least one @Part."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r0, r2, r1)
            throw r0
        L9c8:
            ek.y r3 = new ek.y
            r3.<init>(r2)
            java.lang.reflect.Type r1 = r25.getGenericReturnType()
            boolean r2 = p082ek.C1893f0.m4667h(r1)
            if (r2 != 0) goto Laec
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lae0
            java.lang.Class<ek.z> r1 = p082ek.C1913z.class
            boolean r2 = r3.f8279k
            java.lang.annotation.Annotation[] r4 = r25.getAnnotations()
            if (r2 == 0) goto La3a
            java.lang.reflect.Type[] r5 = r25.getGenericParameterTypes()
            int r6 = r5.length
            int r6 = r6 + (-1)
            r5 = r5[r6]
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r6 = 0
            r5 = r5[r6]
            boolean r8 = r5 instanceof java.lang.reflect.WildcardType
            if (r8 == 0) goto La03
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            r5 = r5[r6]
        La03:
            java.lang.Class r8 = p082ek.C1893f0.m4665f(r5)
            if (r8 != r1) goto La15
            boolean r8 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r8 == 0) goto La15
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r5 = p082ek.C1893f0.m4664e(r6, r5)
            r8 = 1
            goto La16
        La15:
            r8 = 0
        La16:
            ek.f0$b r9 = new ek.f0$b
            java.lang.Class<ek.b> r10 = p082ek.InterfaceC1884b.class
            r11 = 1
            java.lang.reflect.Type[] r12 = new java.lang.reflect.Type[r11]
            r12[r6] = r5
            r5 = 0
            r9.<init>(r5, r10, r12)
            java.lang.Class<ek.d0> r5 = p082ek.InterfaceC1889d0.class
            boolean r5 = p082ek.C1893f0.m4668i(r4, r5)
            if (r5 == 0) goto La2c
            goto La3f
        La2c:
            int r5 = r4.length
            int r5 = r5 + r11
            java.lang.annotation.Annotation[] r5 = new java.lang.annotation.Annotation[r5]
            ek.d0 r10 = p082ek.C1891e0.f8159a
            r5[r6] = r10
            int r10 = r4.length
            java.lang.System.arraycopy(r4, r6, r5, r11, r10)
            r4 = r5
            goto La3f
        La3a:
            java.lang.reflect.Type r9 = r25.getGenericReturnType()
            r8 = 0
        La3f:
            ek.c r5 = r0.m4648a(r9, r4)     // Catch: java.lang.RuntimeException -> Lacf
            java.lang.reflect.Type r4 = r5.mo4653a()
            java.lang.Class<bi.g0> r6 = bi.C0783g0.class
            if (r4 == r6) goto Laab
            if (r4 == r1) goto La9f
            java.lang.String r1 = r3.f8271c
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto La6a
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto La5e
            goto La6a
        La5e:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r6 = r25
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r6, r1, r0)
            throw r0
        La6a:
            r6 = r25
            java.lang.annotation.Annotation[] r1 = r25.getAnnotations()
            ek.f r4 = r0.m4651d(r4, r1)     // Catch: java.lang.RuntimeException -> La90
            bi.f$a r0 = r0.f8148b
            if (r2 != 0) goto La7e
            ek.i$a r1 = new ek.i$a
            r1.<init>(r3, r0, r4, r5)
            goto La8f
        La7e:
            if (r8 == 0) goto La86
            ek.i$c r1 = new ek.i$c
            r1.<init>(r3, r0, r4, r5)
            goto La8f
        La86:
            ek.i$b r7 = new ek.i$b
            r6 = 0
            r1 = r7
            r2 = r3
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        La8f:
            return r1
        La90:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4670k(r6, r1, r2, r0)
            throw r0
        La9f:
            r6 = r25
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r6, r1, r0)
            throw r0
        Laab:
            r6 = r25
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = p082ek.C1893f0.m4665f(r4)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r6, r0, r1)
            throw r0
        Lacf:
            r0 = move-exception
            r6 = r25
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r9
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4670k(r6, r1, r0, r2)
            throw r0
        Lae0:
            r6 = r25
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Service methods cannot return void."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r6, r1, r0)
            throw r0
        Laec:
            r6 = r25
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r6, r0, r2)
            throw r0
        Lafb:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f8283b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.RuntimeException r0 = p082ek.C1893f0.m4669j(r1, r2, r0)
            throw r0
    }

    /* renamed from: a */
    public abstract T mo4657a(java.lang.Object[] r1);
}
