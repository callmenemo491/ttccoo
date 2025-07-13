package p081ej;

/* renamed from: ej.c */
/* loaded from: classes.dex */
public class C1860c extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5882i f8064Y;

    /* renamed from: Z */
    public p317ri.C5882i f8065Z;

    public C1860c(p317ri.AbstractC5915t r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.size()
            r1 = 2
            if (r0 != r1) goto L21
            r0 = 0
            ri.e r0 = r3.mo12277F(r0)
            ri.i r0 = p317ri.C5882i.m12224F(r0)
            r2.f8064Y = r0
            r0 = 1
            ri.e r3 = r3.mo12277F(r0)
            ri.i r3 = p317ri.C5882i.m12224F(r3)
            r2.f8065Z = r3
            return
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.i r1 = r2.f8064Y
            r0.m7087h(r1)
            ri.i r1 = r2.f8065Z
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
