package p072e7;

/* renamed from: e7.s6 */
/* loaded from: classes.dex */
public final class C1739s6 implements p072e7.InterfaceC1680m7 {

    /* renamed from: b */
    public static final p072e7.InterfaceC1802z6 f7778b = null;

    /* renamed from: a */
    public final p072e7.InterfaceC1802z6 f7779a;

    static {
            e7.q6 r0 = new e7.q6
            r0.<init>()
            p072e7.C1739s6.f7778b = r0
            return
    }

    public C1739s6() {
            r6 = this;
            e7.r6 r0 = new e7.r6
            r1 = 2
            e7.z6[] r1 = new p072e7.InterfaceC1802z6[r1]
            e7.u5 r2 = p072e7.C1756u5.f7806a
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "com.google.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L22
            java.lang.String r4 = "getInstance"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L22
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L22
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L22
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L22
            e7.z6 r2 = (p072e7.InterfaceC1802z6) r2     // Catch: java.lang.Exception -> L22
            goto L24
        L22:
            e7.z6 r2 = p072e7.C1739s6.f7778b
        L24:
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r6.<init>()
            java.nio.charset.Charset r1 = p072e7.C1619g6.f7568a
            r6.f7779a = r0
            return
    }
}
