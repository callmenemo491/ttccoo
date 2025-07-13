package p379vh;

/* renamed from: vh.e1 */
/* loaded from: classes.dex */
public class C6696e1 extends p379vh.C6702g1 implements p379vh.InterfaceC6733r {

    /* renamed from: Z */
    public final boolean f25972Z;

    public C6696e1(p379vh.InterfaceC6687b1 r5) {
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            r4.m13575F(r5)
            vh.m r5 = r4.m13572B()
            boolean r1 = r5 instanceof p379vh.C6721n
            r2 = 0
            if (r1 == 0) goto L13
            vh.n r5 = (p379vh.C6721n) r5
            goto L14
        L13:
            r5 = r2
        L14:
            r1 = 0
            if (r5 != 0) goto L19
        L17:
            r0 = 0
            goto L33
        L19:
            vh.g1 r5 = r5.m13571r()
            boolean r3 = r5.mo13564x()
            if (r3 == 0) goto L24
            goto L33
        L24:
            vh.m r5 = r5.m13572B()
            boolean r3 = r5 instanceof p379vh.C6721n
            if (r3 == 0) goto L2f
            vh.n r5 = (p379vh.C6721n) r5
            goto L30
        L2f:
            r5 = r2
        L30:
            if (r5 != 0) goto L19
            goto L17
        L33:
            r4.f25972Z = r0
            return
    }

    @Override // p379vh.C6702g1
    /* renamed from: x */
    public boolean mo13564x() {
            r1 = this;
            boolean r0 = r1.f25972Z
            return r0
    }

    @Override // p379vh.C6702g1
    /* renamed from: y */
    public boolean mo13565y() {
            r1 = this;
            r0 = 1
            return r0
    }
}
