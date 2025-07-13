package p124h7;

/* renamed from: h7.q */
/* loaded from: classes.dex */
public final class C2809q implements p124h7.InterfaceC2684j0 {

    /* renamed from: b */
    public static final p124h7.InterfaceC2917w f11844b = null;

    /* renamed from: a */
    public final p124h7.InterfaceC2917w f11845a;

    static {
            h7.o r0 = new h7.o
            r0.<init>()
            p124h7.C2809q.f11844b = r0
            return
    }

    public C2809q() {
            r6 = this;
            h7.p r0 = new h7.p
            r1 = 2
            h7.w[] r1 = new p124h7.InterfaceC2917w[r1]
            h7.ug r2 = p124h7.C2898ug.f11948a
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
            h7.w r2 = (p124h7.InterfaceC2917w) r2     // Catch: java.lang.Exception -> L22
            goto L24
        L22:
            h7.w r2 = p124h7.C2809q.f11844b
        L24:
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r6.<init>()
            java.nio.charset.Charset r1 = p124h7.C2575d.f11429a
            r6.f11845a = r0
            return
    }
}
