package p317ri;

/* renamed from: ri.g0 */
/* loaded from: classes.dex */
public class C5877g0 implements p317ri.InterfaceC5918u {

    /* renamed from: Y */
    public final /* synthetic */ int f22694Y;

    /* renamed from: Z */
    public ma.C4507a f22695Z;

    public C5877g0(ma.C4507a r2, int r3) {
            r1 = this;
            r1.f22694Y = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.<init>()
            r1.f22695Z = r2
            return
        Lb:
            r1.<init>()
            r1.f22695Z = r2
            return
    }

    @Override // p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            int r0 = r2.f22694Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            ri.s r0 = r2.mo12213i()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L16:
            ri.s r0 = r2.mo12213i()     // Catch: java.io.IOException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // p317ri.InterfaceC5908q1
    /* renamed from: i */
    public p317ri.AbstractC5912s mo12213i() {
            r2 = this;
            int r0 = r2.f22694Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            ri.f0 r0 = new ri.f0
            ma.a r1 = r2.f22695Z
            h7.rb r1 = r1.m10392d()
            r0.<init>(r1)
            return r0
        L12:
            ri.a1 r0 = new ri.a1
            ma.a r1 = r2.f22695Z
            h7.rb r1 = r1.m10392d()
            r0.<init>(r1)
            return r0
    }
}
