package p317ri;

/* renamed from: ri.i0 */
/* loaded from: classes.dex */
public class C5883i0 implements p317ri.InterfaceC5924w {

    /* renamed from: Y */
    public final /* synthetic */ int f22704Y;

    /* renamed from: Z */
    public ma.C4507a f22705Z;

    public C5883i0(ma.C4507a r2, int r3) {
            r1 = this;
            r1.f22704Y = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.<init>()
            r1.f22705Z = r2
            return
        Lb:
            r1.<init>()
            r1.f22705Z = r2
            return
    }

    @Override // p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            int r0 = r4.f22704Y
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L17
        L7:
            ri.s r0 = r4.mo12213i()     // Catch: java.io.IOException -> Lc
            return r0
        Lc:
            r0 = move-exception
            ri.r r2 = new ri.r
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0, r1)
            throw r2
        L17:
            ri.s r0 = r4.mo12213i()     // Catch: java.io.IOException -> L1c
            return r0
        L1c:
            r0 = move-exception
            ri.r r2 = new ri.r
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0, r1)
            throw r2
    }

    @Override // p317ri.InterfaceC5908q1
    /* renamed from: i */
    public p317ri.AbstractC5912s mo12213i() {
            r3 = this;
            int r0 = r3.f22704Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            ri.h0 r0 = new ri.h0
            ma.a r1 = r3.f22705Z
            h7.rb r1 = r1.m10392d()
            r0.<init>(r1)
            return r0
        L12:
            ri.b1 r0 = new ri.b1
            ma.a r1 = r3.f22705Z
            h7.rb r1 = r1.m10392d()
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }
}
