package p124h7;

/* renamed from: h7.e1 */
/* loaded from: classes.dex */
public final class C2595e1 implements p124h7.InterfaceC2943x7 {

    /* renamed from: Y */
    public final /* synthetic */ int f11476Y;

    public C2595e1(int r1) {
            r0 = this;
            r0.f11476Y = r1
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2943x7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ java.lang.Object mo6634a(java.lang.String r2, java.security.Provider r3) {
            r1 = this;
            int r0 = r1.f11476Y
            switch(r0) {
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            if (r3 != 0) goto Ld
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)
            goto L11
        Ld:
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2, r3)
        L11:
            return r2
        L12:
            if (r3 != 0) goto L19
            java.security.Signature r2 = java.security.Signature.getInstance(r2)
            goto L1d
        L19:
            java.security.Signature r2 = java.security.Signature.getInstance(r2, r3)
        L1d:
            return r2
    }

    /* renamed from: b */
    public java.util.concurrent.ExecutorService m6635b(int r9) {
            r8 = this;
            java.util.concurrent.ThreadFactory r7 = java.util.concurrent.Executors.defaultThreadFactory()
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0 = r9
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r9.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.unconfigurableExecutorService(r9)
            return r9
    }

    /* renamed from: c */
    public boolean m6636c(byte[] r7, int r8, int r9) {
            r6 = this;
        L0:
            if (r8 >= r9) goto L9
            r0 = r7[r8]
            if (r0 < 0) goto L9
            int r8 = r8 + 1
            goto L0
        L9:
            r0 = 0
            if (r8 < r9) goto Ld
            goto Lf
        Ld:
            if (r8 < r9) goto L11
        Lf:
            r8 = 0
            goto L71
        L11:
            int r1 = r8 + 1
            r8 = r7[r8]
            if (r8 >= 0) goto L75
            r2 = -32
            r3 = -65
            if (r8 >= r2) goto L2a
            if (r1 >= r9) goto L71
            r2 = -62
            if (r8 < r2) goto L70
            int r8 = r1 + 1
            r1 = r7[r1]
            if (r1 <= r3) goto Ld
            goto L70
        L2a:
            r4 = -16
            if (r8 >= r4) goto L4c
            int r4 = r9 + (-1)
            if (r1 < r4) goto L33
            goto L50
        L33:
            int r4 = r1 + 1
            r1 = r7[r1]
            if (r1 > r3) goto L70
            r5 = -96
            if (r8 != r2) goto L3f
            if (r1 < r5) goto L70
        L3f:
            r2 = -19
            if (r8 != r2) goto L45
            if (r1 >= r5) goto L70
        L45:
            int r8 = r4 + 1
            r1 = r7[r4]
            if (r1 <= r3) goto Ld
            goto L70
        L4c:
            int r2 = r9 + (-2)
            if (r1 < r2) goto L55
        L50:
            int r8 = p124h7.C2631g1.m6742a(r7, r1, r9)
            goto L71
        L55:
            int r2 = r1 + 1
            r1 = r7[r1]
            if (r1 > r3) goto L70
            int r8 = r8 << 28
            int r1 = r1 + 112
            int r1 = r1 + r8
            int r8 = r1 >> 30
            if (r8 != 0) goto L70
            int r8 = r2 + 1
            r1 = r7[r2]
            if (r1 > r3) goto L70
            int r1 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L75
        L70:
            r8 = -1
        L71:
            if (r8 != 0) goto L74
            r0 = 1
        L74:
            return r0
        L75:
            r8 = r1
            goto Ld
    }
}
