package p026b9;

/* renamed from: b9.i0 */
/* loaded from: classes.dex */
public class C0705i0 extends p026b9.AbstractC0690b<java.lang.Object> {

    /* renamed from: a0 */
    public final java.util.Iterator<java.lang.Object> f3962a0;

    /* renamed from: b0 */
    public final /* synthetic */ p026b9.C0707j0.a f3963b0;

    public C0705i0(p026b9.C0707j0.a r1) {
            r0 = this;
            r0.f3963b0 = r1
            r0.<init>()
            java.util.Set r1 = r1.f3968Y
            java.util.Iterator r1 = r1.iterator()
            r0.f3962a0 = r1
            return
    }

    @Override // p026b9.AbstractC0690b
    /* renamed from: a */
    public java.lang.Object mo2257a() {
            r2 = this;
        L0:
            java.util.Iterator<java.lang.Object> r0 = r2.f3962a0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L19
            java.util.Iterator<java.lang.Object> r0 = r2.f3962a0
            java.lang.Object r0 = r0.next()
            b9.j0$a r1 = r2.f3963b0
            java.util.Set r1 = r1.f3969Z
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L0
            return r0
        L19:
            r0 = 3
            r2.f3896Y = r0
            r0 = 0
            return r0
    }
}
