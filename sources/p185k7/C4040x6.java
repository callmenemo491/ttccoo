package p185k7;

/* renamed from: k7.x6 */
/* loaded from: classes.dex */
public final class C4040x6 implements p185k7.InterfaceC3963r7 {

    /* renamed from: b */
    public static final p185k7.InterfaceC3788e7 f16947b = null;

    /* renamed from: a */
    public final p185k7.InterfaceC3788e7 f16948a;

    static {
            k7.v6 r0 = new k7.v6
            r0.<init>()
            p185k7.C4040x6.f16947b = r0
            return
    }

    public C4040x6() {
            r6 = this;
            k7.w6 r0 = new k7.w6
            r1 = 2
            k7.e7[] r1 = new p185k7.InterfaceC3788e7[r1]
            k7.z5 r2 = p185k7.C4065z5.f16981a
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
            k7.e7 r2 = (p185k7.InterfaceC3788e7) r2     // Catch: java.lang.Exception -> L22
            goto L24
        L22:
            k7.e7 r2 = p185k7.C4040x6.f16947b
        L24:
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r6.<init>()
            java.nio.charset.Charset r1 = p185k7.C3871k6.f16722a
            r6.f16948a = r0
            return
    }
}
