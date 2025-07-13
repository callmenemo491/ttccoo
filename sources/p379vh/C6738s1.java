package p379vh;

/* renamed from: vh.s1 */
/* loaded from: classes.dex */
public final class C6738s1 {

    /* renamed from: a */
    public static final p379vh.C6738s1 f26034a = null;

    /* renamed from: b */
    public static final java.lang.ThreadLocal<p379vh.AbstractC6725o0> f26035b = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p379vh.C6738s1.f26035b = r0
            return
    }

    /* renamed from: a */
    public static final p379vh.AbstractC6725o0 m13665a() {
            java.lang.ThreadLocal<vh.o0> r0 = p379vh.C6738s1.f26035b
            java.lang.Object r1 = r0.get()
            vh.o0 r1 = (p379vh.AbstractC6725o0) r1
            if (r1 != 0) goto L16
            vh.d r1 = new vh.d
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            r0.set(r1)
        L16:
            return r1
    }
}
