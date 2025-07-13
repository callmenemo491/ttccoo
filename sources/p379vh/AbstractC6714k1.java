package p379vh;

/* renamed from: vh.k1 */
/* loaded from: classes.dex */
public abstract class AbstractC6714k1 extends p379vh.AbstractC6755z {
    public AbstractC6714k1() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A0 */
    public final java.lang.String m13639A0() {
            r2 = this;
            vh.z r0 = p379vh.C6716l0.f26007a
            vh.k1 r0 = p459zh.C7346l.f28106a
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            return r0
        L9:
            r1 = 0
            vh.k1 r0 = r0.mo13640z0()     // Catch: java.lang.UnsupportedOperationException -> Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r2 != r0) goto L15
            java.lang.String r0 = "Dispatchers.Main.immediate"
            return r0
        L15:
            return r1
    }

    @Override // p379vh.AbstractC6755z
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.m13639A0()
            if (r0 != 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = gh.C2390b.m6121k(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L26:
            return r0
    }

    /* renamed from: z0 */
    public abstract p379vh.AbstractC6714k1 mo13640z0();
}
