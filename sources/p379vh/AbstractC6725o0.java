package p379vh;

/* renamed from: vh.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC6725o0 extends p379vh.AbstractC6755z {

    /* renamed from: Z */
    public long f26012Z;

    /* renamed from: a0 */
    public boolean f26013a0;

    /* renamed from: b0 */
    public p387w5.C6800c f26014b0;

    public AbstractC6725o0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A0 */
    public final long m13643A0(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L8
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto La
        L8:
            r0 = 1
        La:
            return r0
    }

    /* renamed from: B0 */
    public final void m13644B0(p379vh.AbstractC6710j0<?> r4) {
            r3 = this;
            w5.c r0 = r3.f26014b0
            if (r0 != 0) goto Lb
            w5.c r0 = new w5.c
            r0.<init>()
            r3.f26014b0 = r0
        Lb:
            java.lang.Object r1 = r0.f26411d
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r0.f26410c
            r1[r2] = r4
            int r2 = r2 + 1
            int r4 = r1.length
            int r4 = r4 + (-1)
            r4 = r4 & r2
            r0.f26410c = r4
            int r1 = r0.f26409b
            if (r4 != r1) goto L22
            r0.m13832a()
        L22:
            return
    }

    /* renamed from: C0 */
    public final void m13645C0(boolean r5) {
            r4 = this;
            long r0 = r4.f26012Z
            long r2 = r4.m13643A0(r5)
            long r2 = r2 + r0
            r4.f26012Z = r2
            if (r5 != 0) goto Le
            r5 = 1
            r4.f26013a0 = r5
        Le:
            return
    }

    /* renamed from: D0 */
    public final boolean m13646D0() {
            r6 = this;
            long r0 = r6.f26012Z
            r2 = 1
            long r3 = r6.m13643A0(r2)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: E0 */
    public final boolean m13647E0() {
            r7 = this;
            w5.c r0 = r7.f26014b0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.f26409b
            int r3 = r0.f26410c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto Lf
            goto L24
        Lf:
            java.lang.Object r3 = r0.f26411d
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + (-1)
            r2 = r2 & r3
            r0.f26409b = r2
            java.lang.String r0 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            java.util.Objects.requireNonNull(r6, r0)
            r4 = r6
        L24:
            vh.j0 r4 = (p379vh.AbstractC6710j0) r4
            if (r4 != 0) goto L29
            return r1
        L29:
            r4.run()
            return r5
    }

    public void shutdown() {
            r0 = this;
            return
    }

    /* renamed from: z0 */
    public final void m13648z0(boolean r5) {
            r4 = this;
            long r0 = r4.f26012Z
            long r2 = r4.m13643A0(r5)
            long r0 = r0 - r2
            r4.f26012Z = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L10
            return
        L10:
            boolean r5 = r4.f26013a0
            if (r5 == 0) goto L17
            r4.shutdown()
        L17:
            return
    }
}
