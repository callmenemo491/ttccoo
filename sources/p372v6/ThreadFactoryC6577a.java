package p372v6;

/* renamed from: v6.a */
/* loaded from: classes.dex */
public class ThreadFactoryC6577a implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public final java.lang.String f25730a;

    /* renamed from: b */
    public final java.util.concurrent.ThreadFactory f25731b;

    public ThreadFactoryC6577a(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.f25731b = r0
            r1.f25730a = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    @androidx.annotation.RecentlyNonNull
    public java.lang.Thread newThread(@androidx.annotation.RecentlyNonNull java.lang.Runnable r3) {
            r2 = this;
            java.util.concurrent.ThreadFactory r0 = r2.f25731b
            e6.y r1 = new e6.y
            r1.<init>(r3)
            java.lang.Thread r3 = r0.newThread(r1)
            java.lang.String r0 = r2.f25730a
            r3.setName(r0)
            return r3
    }
}
