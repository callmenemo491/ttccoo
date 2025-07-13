package p185k7;

/* renamed from: k7.b1 */
/* loaded from: classes.dex */
public final class C3740b1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ android.content.Context f16529c0;

    /* renamed from: d0 */
    public final /* synthetic */ android.os.Bundle f16530d0;

    /* renamed from: e0 */
    public final /* synthetic */ p185k7.C3918o1 f16531e0;

    public C3740b1(p185k7.C3918o1 r1, java.lang.String r2, java.lang.String r3, android.content.Context r4, android.os.Bundle r5) {
            r0 = this;
            r0.f16531e0 = r1
            r0.f16529c0 = r4
            r0.f16530d0 = r5
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r18 = this;
            r1 = r18
            java.lang.String r2 = "null reference"
            java.lang.String r3 = "com.google.android.gms.measurement.dynamite"
            r4 = 0
            r5 = 1
            android.content.Context r0 = r1.f16529c0     // Catch: java.lang.Exception -> L7f
            java.util.Objects.requireNonNull(r0, r2)     // Catch: java.lang.Exception -> L7f
            k7.o1 r6 = r1.f16531e0     // Catch: java.lang.Exception -> L7f
            android.content.Context r0 = r1.f16529c0     // Catch: java.lang.Exception -> L7f
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Exception -> L7f
            com.google.android.gms.dynamite.DynamiteModule$b r7 = com.google.android.gms.dynamite.DynamiteModule.f5642l     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L25 java.lang.Exception -> L7f
            com.google.android.gms.dynamite.DynamiteModule r0 = com.google.android.gms.dynamite.DynamiteModule.m3108c(r0, r7, r3)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L25 java.lang.Exception -> L7f
            java.lang.String r7 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"
            android.os.IBinder r0 = r0.m3118b(r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L25 java.lang.Exception -> L7f
            k7.o0 r0 = p185k7.AbstractBinderC3904n0.asInterface(r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L25 java.lang.Exception -> L7f
            goto L2a
        L25:
            r0 = move-exception
            r6.m8851a(r0, r5, r4)     // Catch: java.lang.Exception -> L7f
            r0 = 0
        L2a:
            r6.f16796f = r0     // Catch: java.lang.Exception -> L7f
            k7.o1 r0 = r1.f16531e0     // Catch: java.lang.Exception -> L7f
            k7.o0 r0 = r0.f16796f     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L3f
            k7.o1 r0 = r1.f16531e0     // Catch: java.lang.Exception -> L7f
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = "FA"
            java.lang.String r2 = "Failed to connect to measurement client."
            android.util.Log.w(r0, r2)     // Catch: java.lang.Exception -> L7f
            return
        L3f:
            android.content.Context r0 = r1.f16529c0     // Catch: java.lang.Exception -> L7f
            int r0 = com.google.android.gms.dynamite.DynamiteModule.m3107a(r0, r3)     // Catch: java.lang.Exception -> L7f
            android.content.Context r6 = r1.f16529c0     // Catch: java.lang.Exception -> L7f
            int r3 = com.google.android.gms.dynamite.DynamiteModule.m3109d(r6, r3, r4)     // Catch: java.lang.Exception -> L7f
            int r6 = java.lang.Math.max(r0, r3)     // Catch: java.lang.Exception -> L7f
            if (r3 >= r0) goto L53
            r12 = 1
            goto L54
        L53:
            r12 = 0
        L54:
            k7.x0 r0 = new k7.x0     // Catch: java.lang.Exception -> L7f
            long r10 = (long) r6     // Catch: java.lang.Exception -> L7f
            r8 = 43042(0xa822, double:2.12656E-319)
            android.os.Bundle r3 = r1.f16530d0     // Catch: java.lang.Exception -> L7f
            android.content.Context r6 = r1.f16529c0     // Catch: java.lang.Exception -> L7f
            java.lang.String r17 = p249o7.C4962b4.m11110a(r6)     // Catch: java.lang.Exception -> L7f
            r15 = 0
            r14 = 0
            r13 = 0
            r7 = r0
            r16 = r3
            r7.<init>(r8, r10, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L7f
            k7.o1 r3 = r1.f16531e0     // Catch: java.lang.Exception -> L7f
            k7.o0 r3 = r3.f16796f     // Catch: java.lang.Exception -> L7f
            java.util.Objects.requireNonNull(r3, r2)     // Catch: java.lang.Exception -> L7f
            android.content.Context r2 = r1.f16529c0     // Catch: java.lang.Exception -> L7f
            x6.b r6 = new x6.b     // Catch: java.lang.Exception -> L7f
            r6.<init>(r2)     // Catch: java.lang.Exception -> L7f
            long r7 = r1.f16698Y     // Catch: java.lang.Exception -> L7f
            r3.initialize(r6, r0, r7)     // Catch: java.lang.Exception -> L7f
            return
        L7f:
            r0 = move-exception
            k7.o1 r2 = r1.f16531e0
            r2.m8851a(r0, r5, r4)
            return
    }
}
