package p082ek;

/* renamed from: ek.b0 */
/* loaded from: classes.dex */
public final class C1885b0 {

    /* renamed from: a */
    public final java.util.Map<java.lang.reflect.Method, p082ek.AbstractC1887c0<?>> f8147a;

    /* renamed from: b */
    public final bi.InterfaceC0780f.a f8148b;

    /* renamed from: c */
    public final bi.C0803w f8149c;

    /* renamed from: d */
    public final java.util.List<p082ek.InterfaceC1892f.a> f8150d;

    /* renamed from: e */
    public final java.util.List<p082ek.InterfaceC1886c.a> f8151e;

    /* renamed from: f */
    public final boolean f8152f;

    public C1885b0(bi.InterfaceC0780f.a r1, bi.C0803w r2, java.util.List<p082ek.InterfaceC1892f.a> r3, java.util.List<p082ek.InterfaceC1886c.a> r4, java.util.concurrent.Executor r5, boolean r6) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            r0.f8147a = r5
            r0.f8148b = r1
            r0.f8149c = r2
            r0.f8150d = r3
            r0.f8151e = r4
            r0.f8152f = r6
            return
    }

    /* renamed from: a */
    public p082ek.InterfaceC1886c<?, ?> m4648a(java.lang.reflect.Type r5, java.lang.annotation.Annotation[] r6) {
            r4 = this;
            java.lang.String r0 = "returnType == null"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.util.List<ek.c$a> r0 = r4.f8151e
            r1 = 0
            int r0 = r0.indexOf(r1)
            int r0 = r0 + 1
            java.util.List<ek.c$a> r1 = r4.f8151e
            int r1 = r1.size()
            r2 = r0
        L1a:
            if (r2 >= r1) goto L2e
            java.util.List<ek.c$a> r3 = r4.f8151e
            java.lang.Object r3 = r3.get(r2)
            ek.c$a r3 = (p082ek.InterfaceC1886c.a) r3
            ek.c r3 = r3.mo4655a(r5, r6, r4)
            if (r3 == 0) goto L2b
            return r3
        L2b:
            int r2 = r2 + 1
            goto L1a
        L2e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not locate call adapter for "
            r6.<init>(r1)
            r6.append(r5)
            java.lang.String r5 = ".\n"
            r6.append(r5)
            java.lang.String r5 = "  Tried:"
            r6.append(r5)
            java.util.List<ek.c$a> r5 = r4.f8151e
            int r5 = r5.size()
        L48:
            if (r0 >= r5) goto L65
            java.lang.String r1 = "\n   * "
            r6.append(r1)
            java.util.List<ek.c$a> r1 = r4.f8151e
            java.lang.Object r1 = r1.get(r0)
            ek.c$a r1 = (p082ek.InterfaceC1886c.a) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r6.append(r1)
            int r0 = r0 + 1
            goto L48
        L65:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: b */
    public p082ek.AbstractC1887c0<?> m4649b(java.lang.reflect.Method r4) {
            r3 = this;
            java.util.Map<java.lang.reflect.Method, ek.c0<?>> r0 = r3.f8147a
            java.lang.Object r0 = r0.get(r4)
            ek.c0 r0 = (p082ek.AbstractC1887c0) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.Map<java.lang.reflect.Method, ek.c0<?>> r0 = r3.f8147a
            monitor-enter(r0)
            java.util.Map<java.lang.reflect.Method, ek.c0<?>> r1 = r3.f8147a     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L23
            ek.c0 r1 = (p082ek.AbstractC1887c0) r1     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L21
            ek.c0 r1 = p082ek.AbstractC1887c0.m4656b(r3, r4)     // Catch: java.lang.Throwable -> L23
            java.util.Map<java.lang.reflect.Method, ek.c0<?>> r2 = r3.f8147a     // Catch: java.lang.Throwable -> L23
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    /* renamed from: c */
    public <T> p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> m4650c(java.lang.reflect.Type r5, java.lang.annotation.Annotation[] r6, java.lang.annotation.Annotation[] r7) {
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = "parameterAnnotations == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "methodAnnotations == null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.List<ek.f$a> r0 = r4.f8150d
            r1 = 0
            int r0 = r0.indexOf(r1)
            int r0 = r0 + 1
            java.util.List<ek.f$a> r1 = r4.f8150d
            int r1 = r1.size()
            r2 = r0
        L1f:
            if (r2 >= r1) goto L33
            java.util.List<ek.f$a> r3 = r4.f8150d
            java.lang.Object r3 = r3.get(r2)
            ek.f$a r3 = (p082ek.InterfaceC1892f.a) r3
            ek.f r3 = r3.mo4640a(r5, r6, r7, r4)
            if (r3 == 0) goto L30
            return r3
        L30:
            int r2 = r2 + 1
            goto L1f
        L33:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Could not locate RequestBody converter for "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = ".\n"
            r6.append(r5)
            java.lang.String r5 = "  Tried:"
            r6.append(r5)
            java.util.List<ek.f$a> r5 = r4.f8150d
            int r5 = r5.size()
        L4d:
            if (r0 >= r5) goto L6a
            java.lang.String r7 = "\n   * "
            r6.append(r7)
            java.util.List<ek.f$a> r7 = r4.f8150d
            java.lang.Object r7 = r7.get(r0)
            ek.f$a r7 = (p082ek.InterfaceC1892f.a) r7
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r6.append(r7)
            int r0 = r0 + 1
            goto L4d
        L6a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: d */
    public <T> p082ek.InterfaceC1892f<bi.AbstractC0785h0, T> m4651d(java.lang.reflect.Type r5, java.lang.annotation.Annotation[] r6) {
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.util.List<ek.f$a> r0 = r4.f8150d
            r1 = 0
            int r0 = r0.indexOf(r1)
            int r0 = r0 + 1
            java.util.List<ek.f$a> r1 = r4.f8150d
            int r1 = r1.size()
            r2 = r0
        L1a:
            if (r2 >= r1) goto L2e
            java.util.List<ek.f$a> r3 = r4.f8150d
            java.lang.Object r3 = r3.get(r2)
            ek.f$a r3 = (p082ek.InterfaceC1892f.a) r3
            ek.f r3 = r3.mo4641b(r5, r6, r4)
            if (r3 == 0) goto L2b
            return r3
        L2b:
            int r2 = r2 + 1
            goto L1a
        L2e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not locate ResponseBody converter for "
            r6.<init>(r1)
            r6.append(r5)
            java.lang.String r5 = ".\n"
            r6.append(r5)
            java.lang.String r5 = "  Tried:"
            r6.append(r5)
            java.util.List<ek.f$a> r5 = r4.f8150d
            int r5 = r5.size()
        L48:
            if (r0 >= r5) goto L65
            java.lang.String r1 = "\n   * "
            r6.append(r1)
            java.util.List<ek.f$a> r1 = r4.f8150d
            java.lang.Object r1 = r1.get(r0)
            ek.f$a r1 = (p082ek.InterfaceC1892f.a) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r6.append(r1)
            int r0 = r0 + 1
            goto L48
        L65:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: e */
    public <T> p082ek.InterfaceC1892f<T, java.lang.String> m4652e(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3) {
            r1 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r2 = "annotations == null"
            java.util.Objects.requireNonNull(r3, r2)
            java.util.List<ek.f$a> r2 = r1.f8150d
            int r2 = r2.size()
            r3 = 0
        L11:
            if (r3 >= r2) goto L21
            java.util.List<ek.f$a> r0 = r1.f8150d
            java.lang.Object r0 = r0.get(r3)
            ek.f$a r0 = (p082ek.InterfaceC1892f.a) r0
            java.util.Objects.requireNonNull(r0)
            int r3 = r3 + 1
            goto L11
        L21:
            ek.a$d r2 = p082ek.C1882a.d.f8140a
            return r2
    }
}
