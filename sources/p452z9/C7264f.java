package p452z9;

/* renamed from: z9.f */
/* loaded from: classes.dex */
public class C7264f {

    /* renamed from: a */
    public final p056da.C1385y f27873a;

    public C7264f(p056da.C1385y r1) {
            r0 = this;
            r0.<init>()
            r0.f27873a = r1
            return
    }

    /* renamed from: a */
    public static p452z9.C7264f m14340a() {
            o9.d r0 = p251o9.C5180d.m11494c()
            java.lang.Class<z9.f> r1 = p452z9.C7264f.class
            r0.m11497a()
            y9.i r0 = r0.f20315d
            java.lang.Object r0 = r0.mo14246a(r1)
            z9.f r0 = (p452z9.C7264f) r0
            java.lang.String r1 = "FirebaseCrashlytics component is not present."
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    /* renamed from: b */
    public void m14341b(java.lang.Throwable r9) {
            r8 = this;
            da.y r0 = r8.f27873a
            da.r r2 = r0.f6986f
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.util.Objects.requireNonNull(r2)
            long r3 = java.lang.System.currentTimeMillis()
            da.f r0 = r2.f6952d
            da.t r7 = new da.t
            r1 = r7
            r5 = r9
            r1.<init>(r2, r3, r5, r6)
            da.g r9 = new da.g
            r9.<init>(r0, r7)
            r0.m3872b(r9)
            return
    }
}
