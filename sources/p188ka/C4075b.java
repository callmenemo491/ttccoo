package p188ka;

/* renamed from: ka.b */
/* loaded from: classes.dex */
public class C4075b implements p188ka.InterfaceC4076c {

    /* renamed from: a */
    public final android.content.Context f16994a;

    /* renamed from: b */
    public final la.C4237e f16995b;

    /* renamed from: c */
    public final p124h7.C2839rb f16996c;

    /* renamed from: d */
    public final p214m2.C4339q f16997d;

    /* renamed from: e */
    public final p185k7.C3827h4 f16998e;

    /* renamed from: f */
    public final androidx.fragment.app.C0392l0 f16999f;

    /* renamed from: g */
    public final p056da.C1353d0 f17000g;

    /* renamed from: h */
    public final java.util.concurrent.atomic.AtomicReference<la.InterfaceC4235c> f17001h;

    /* renamed from: i */
    public final java.util.concurrent.atomic.AtomicReference<p327s7.C5986j<la.C4233a>> f17002i;

    public C4075b(android.content.Context r14, la.C4237e r15, p214m2.C4339q r16, p124h7.C2839rb r17, p185k7.C3827h4 r18, androidx.fragment.app.C0392l0 r19, p056da.C1353d0 r20) {
            r13 = this;
            r0 = r13
            r1 = r16
            r13.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.f17001h = r2
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            s7.j r4 = new s7.j
            r4.<init>()
            r3.<init>(r4)
            r0.f17002i = r3
            r3 = r14
            r0.f16994a = r3
            r3 = r15
            r0.f16995b = r3
            r0.f16997d = r1
            r3 = r17
            r0.f16996c = r3
            r3 = r18
            r0.f16998e = r3
            r3 = r19
            r0.f16999f = r3
            r3 = r20
            r0.f17000g = r3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "max_custom_exception_events"
            r5 = 8
            int r4 = r3.optInt(r4, r5)
            n0.k r9 = new n0.k
            r5 = 4
            r9.<init>(r4, r5)
            la.b r10 = p367v1.C6488b.m13177i(r3)
            r4 = 3600(0xe10, double:1.7786E-320)
            long r6 = p367v1.C6488b.m13178j(r1, r4, r3)
            la.d r1 = new la.d
            r8 = 0
            r11 = 0
            r12 = 3600(0xe10, float:5.045E-42)
            r5 = r1
            r5.<init>(r6, r8, r9, r10, r11, r12)
            r2.set(r1)
            return
    }

    /* renamed from: a */
    public final la.C4236d m9170a(int r9) {
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 2
            r2 = 0
            boolean r3 = p365v.C6480g.m13147a(r1, r9)     // Catch: java.lang.Exception -> L47
            if (r3 != 0) goto L70
            k7.h4 r3 = r8.f16998e     // Catch: java.lang.Exception -> L47
            org.json.JSONObject r3 = r3.m8570d()     // Catch: java.lang.Exception -> L47
            r4 = 3
            if (r3 == 0) goto L5f
            h7.rb r5 = r8.f16996c     // Catch: java.lang.Exception -> L47
            la.d r5 = r5.m7095q(r3)     // Catch: java.lang.Exception -> L47
            if (r5 == 0) goto L59
            java.lang.String r6 = "Loaded cached settings: "
            r8.m9172c(r3, r6)     // Catch: java.lang.Exception -> L47
            m2.q r3 = r8.f16997d     // Catch: java.lang.Exception -> L47
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Exception -> L47
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L47
            boolean r9 = p365v.C6480g.m13147a(r4, r9)     // Catch: java.lang.Exception -> L47
            if (r9 != 0) goto L49
            long r3 = r5.f17397d     // Catch: java.lang.Exception -> L47
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 >= 0) goto L37
            r9 = 1
            goto L38
        L37:
            r9 = 0
        L38:
            if (r9 != 0) goto L3b
            goto L49
        L3b:
            java.lang.String r9 = "Cached settings have expired."
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L70
            android.util.Log.v(r0, r9, r2)     // Catch: java.lang.Exception -> L47
            goto L70
        L47:
            r9 = move-exception
            goto L6b
        L49:
            java.lang.String r9 = "Returning cached settings."
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Exception -> L56
            if (r1 == 0) goto L54
            android.util.Log.v(r0, r9, r2)     // Catch: java.lang.Exception -> L56
        L54:
            r2 = r5
            goto L70
        L56:
            r9 = move-exception
            r2 = r5
            goto L6b
        L59:
            java.lang.String r9 = "Failed to parse cached settings data."
            android.util.Log.e(r0, r9, r2)     // Catch: java.lang.Exception -> L47
            goto L70
        L5f:
            java.lang.String r9 = "No cached settings data found."
            boolean r1 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L70
            android.util.Log.d(r0, r9, r2)     // Catch: java.lang.Exception -> L47
            goto L70
        L6b:
            java.lang.String r1 = "Failed to get cached settings"
            android.util.Log.e(r0, r1, r9)
        L70:
            return r2
    }

    /* renamed from: b */
    public la.InterfaceC4235c m9171b() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<la.c> r0 = r1.f17001h
            java.lang.Object r0 = r0.get()
            la.c r0 = (la.InterfaceC4235c) r0
            return r0
    }

    /* renamed from: c */
    public final void m9172c(org.json.JSONObject r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 3
            java.lang.String r0 = "FirebaseCrashlytics"
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto L1c
            r3 = 0
            android.util.Log.d(r0, r2, r3)
        L1c:
            return
    }
}
