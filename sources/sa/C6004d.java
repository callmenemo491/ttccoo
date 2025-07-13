package sa;

/* renamed from: sa.d */
/* loaded from: classes.dex */
public class C6004d implements qa.InterfaceC5604a {

    /* renamed from: a */
    public final /* synthetic */ sa.C6005e f23138a;

    public C6004d(sa.C6005e r1) {
            r0 = this;
            r0.f23138a = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void m12485a(java.lang.Object r8, java.io.Writer r9) {
            r7 = this;
            sa.f r6 = new sa.f
            sa.e r0 = r7.f23138a
            java.util.Map<java.lang.Class<?>, qa.e<?>> r2 = r0.f23140a
            java.util.Map<java.lang.Class<?>, qa.g<?>> r3 = r0.f23141b
            qa.e<java.lang.Object> r4 = r0.f23142c
            boolean r5 = r0.f23143d
            r0 = r6
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = 0
            r6.m12487g(r8, r9)
            r6.m12489i()
            android.util.JsonWriter r8 = r6.f23146b
            r8.flush()
            return
    }
}
