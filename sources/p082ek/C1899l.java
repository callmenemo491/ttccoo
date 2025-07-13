package p082ek;

/* renamed from: ek.l */
/* loaded from: classes.dex */
public final class C1899l implements p082ek.InterfaceC1888d<java.lang.Object> {

    /* renamed from: a */
    public final /* synthetic */ p379vh.InterfaceC6703h f8183a;

    public C1899l(p379vh.InterfaceC6703h r1) {
            r0 = this;
            r0.f8183a = r1
            r0.<init>()
            return
    }

    @Override // p082ek.InterfaceC1888d
    /* renamed from: a */
    public void mo4658a(p082ek.InterfaceC1884b<java.lang.Object> r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "call"
            p214m2.C4339q.m9707l(r2, r0)
            java.lang.String r2 = "t"
            p214m2.C4339q.m9707l(r3, r2)
            vh.h r2 = r1.f8183a
            java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
            r2.mo5707k(r3)
            return
    }

    @Override // p082ek.InterfaceC1888d
    /* renamed from: b */
    public void mo4659b(p082ek.InterfaceC1884b<java.lang.Object> r4, p082ek.C1913z<java.lang.Object> r5) {
            r3 = this;
            java.lang.String r0 = "call"
            p214m2.C4339q.m9707l(r4, r0)
            java.lang.String r0 = "response"
            p214m2.C4339q.m9707l(r5, r0)
            boolean r0 = r5.m4697a()
            if (r0 == 0) goto L7f
            T r5 = r5.f8306b
            if (r5 != 0) goto L7c
            bi.c0 r4 = r4.mo4645i()
            java.lang.Class<ek.j> r5 = p082ek.C1897j.class
            java.util.Objects.requireNonNull(r4)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r5, r0)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r4 = r4.f4198f
            java.lang.Object r4 = r4.get(r5)
            java.lang.Object r4 = r5.cast(r4)
            if (r4 == 0) goto L77
            java.lang.String r5 = "call.request().tag(Invocation::class.java)!!"
            p214m2.C4339q.m9703h(r4, r5)
            ek.j r4 = (p082ek.C1897j) r4
            java.lang.reflect.Method r4 = r4.f8180a
            ch.b r5 = new ch.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Response from "
            r0.append(r1)
            java.lang.String r1 = "method"
            p214m2.C4339q.m9703h(r4, r1)
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.String r2 = "method.declaringClass"
            p214m2.C4339q.m9703h(r1, r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = " was null but response body type was declared as non-null"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            vh.h r4 = r3.f8183a
            java.lang.Object r5 = p074e9.C1805a.m4520e(r5)
            goto L8a
        L77:
            p214m2.C4339q.m9712v()
            r4 = 0
            throw r4
        L7c:
            vh.h r4 = r3.f8183a
            goto L8a
        L7f:
            vh.h r4 = r3.f8183a
            ek.h r0 = new ek.h
            r0.<init>(r5)
            java.lang.Object r5 = p074e9.C1805a.m4520e(r0)
        L8a:
            r4.mo5707k(r5)
            return
    }
}
