package p184k6;

/* renamed from: k6.a */
/* loaded from: classes.dex */
public class ServiceConnectionC3696a implements android.content.ServiceConnection {

    /* renamed from: Y */
    public boolean f16386Y;

    /* renamed from: Z */
    public final java.util.concurrent.BlockingQueue<android.os.IBinder> f16387Z;

    public ServiceConnectionC3696a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f16386Y = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.f16387Z = r0
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public android.os.IBinder m8156a(long r2, @androidx.annotation.RecentlyNonNull java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.lang.String r0 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread"
            com.google.android.gms.common.internal.C1101a.m3102g(r0)
            boolean r0 = r1.f16386Y
            if (r0 != 0) goto L1f
            r0 = 1
            r1.f16386Y = r0
            java.util.concurrent.BlockingQueue<android.os.IBinder> r0 = r1.f16387Z
            java.lang.Object r2 = r0.poll(r2, r4)
            android.os.IBinder r2 = (android.os.IBinder) r2
            if (r2 == 0) goto L17
            return r2
        L17:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = "Timed out waiting for the service connection"
            r2.<init>(r3)
            throw r2
        L1f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot call get on this connection more than once"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@androidx.annotation.RecentlyNonNull android.content.ComponentName r1, @androidx.annotation.RecentlyNonNull android.os.IBinder r2) {
            r0 = this;
            java.util.concurrent.BlockingQueue<android.os.IBinder> r1 = r0.f16387Z
            r1.add(r2)
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@androidx.annotation.RecentlyNonNull android.content.ComponentName r1) {
            r0 = this;
            return
    }
}
