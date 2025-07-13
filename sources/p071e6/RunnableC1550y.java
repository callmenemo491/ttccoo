package p071e6;

/* renamed from: e6.y */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1550y implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f7470Y;

    /* renamed from: Z */
    public final java.lang.Object f7471Z;

    /* renamed from: a0 */
    public final int f7472a0;

    public /* synthetic */ RunnableC1550y(com.google.android.gms.cast.framework.media.MediaNotificationService r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f7470Y = r0
            r1.<init>()
            r1.f7471Z = r2
            r1.f7472a0 = r3
            return
    }

    public RunnableC1550y(java.lang.Runnable r2) {
            r1 = this;
            r0 = 1
            r1.f7470Y = r0
            r1.<init>()
            r1.f7471Z = r2
            r2 = 0
            r1.f7472a0 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f7470Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r2.f7471Z
            com.google.android.gms.cast.framework.media.MediaNotificationService r0 = (com.google.android.gms.cast.framework.media.MediaNotificationService) r0
            int r1 = r2.f7472a0
            r0.stopSelf(r1)
            return
        L10:
            int r0 = r2.f7472a0
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r2.f7471Z
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
    }
}
