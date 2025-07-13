package p071e6;

/* renamed from: e6.r */
/* loaded from: classes.dex */
public final class C1543r extends java.util.TimerTask {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1073j f7468Y;

    public C1543r(com.google.android.gms.cast.framework.media.C1073j r1, com.google.android.gms.cast.framework.media.C1065b r2) {
            r0 = this;
            r0.f7468Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.cast.framework.media.j r0 = r4.f7468Y
            com.google.android.gms.cast.framework.media.b r1 = r0.f5511e
            java.util.Set<com.google.android.gms.cast.framework.media.b$d> r0 = r0.f5507a
            int r2 = com.google.android.gms.cast.framework.media.C1065b.f5487k
            r1.m3015w(r0)
            com.google.android.gms.cast.framework.media.j r0 = r4.f7468Y
            com.google.android.gms.cast.framework.media.b r1 = r0.f5511e
            android.os.Handler r1 = r1.f5489b
            long r2 = r0.f5508b
            r1.postDelayed(r4, r2)
            return
    }
}
