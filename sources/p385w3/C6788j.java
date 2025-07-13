package p385w3;

/* renamed from: w3.j */
/* loaded from: classes.dex */
public final class C6788j implements p335t3.InterfaceC6154g {

    /* renamed from: a */
    public final java.util.Set<p335t3.C6149b> f26334a;

    /* renamed from: b */
    public final p385w3.AbstractC6787i f26335b;

    /* renamed from: c */
    public final p385w3.InterfaceC6790l f26336c;

    public C6788j(java.util.Set<p335t3.C6149b> r1, p385w3.AbstractC6787i r2, p385w3.InterfaceC6790l r3) {
            r0 = this;
            r0.<init>()
            r0.f26334a = r1
            r0.f26335b = r2
            r0.f26336c = r3
            return
    }

    @Override // p335t3.InterfaceC6154g
    /* renamed from: a */
    public <T> p335t3.InterfaceC6153f<T> mo12698a(java.lang.String r7, java.lang.Class<T> r8, p335t3.C6149b r9, p335t3.InterfaceC6152e<T, byte[]> r10) {
            r6 = this;
            java.util.Set<t3.b> r8 = r6.f26334a
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L16
            w3.k r8 = new w3.k
            w3.i r1 = r6.f26335b
            w3.l r5 = r6.f26336c
            r0 = r8
            r2 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L16:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r10 = 0
            r8[r10] = r9
            r9 = 1
            java.util.Set<t3.b> r10 = r6.f26334a
            r8[r9] = r10
            java.lang.String r9 = "%s is not supported byt this factory. Supported encodings are: %s."
            java.lang.String r8 = java.lang.String.format(r9, r8)
            r7.<init>(r8)
            throw r7
    }
}
