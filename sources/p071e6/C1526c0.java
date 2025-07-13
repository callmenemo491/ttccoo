package p071e6;

/* renamed from: e6.c0 */
/* loaded from: classes.dex */
public final class C1526c0 extends java.util.TimerTask {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1064a f7403Y;

    public C1526c0(com.google.android.gms.cast.framework.media.C1064a r1) {
            r0 = this;
            r0.f7403Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.cast.framework.media.a r0 = r6.f7403Y
            java.util.Deque<java.lang.Integer> r1 = r0.f5481h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lb
            goto L4e
        Lb:
            l6.e<com.google.android.gms.cast.framework.media.b$c> r1 = r0.f5484k
            if (r1 != 0) goto L4e
            long r1 = r0.f5475b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L4e
            com.google.android.gms.cast.framework.media.b r1 = r0.f5476c
            java.util.Deque<java.lang.Integer> r2 = r0.f5481h
            int[] r2 = p123h6.C2487a.m6369h(r2)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r3)
            boolean r3 = r1.m3016x()
            if (r3 != 0) goto L35
            r1 = 17
            r2 = 0
            l6.e r1 = com.google.android.gms.cast.framework.media.C1065b.m2993s(r1, r2)
            goto L3e
        L35:
            e6.m r3 = new e6.m
            r3.<init>(r1, r2)
            com.google.android.gms.cast.framework.media.C1065b.m2994y(r3)
            r1 = r3
        L3e:
            r0.f5484k = r1
            e6.b0 r2 = new e6.b0
            r3 = 1
            r2.<init>(r0, r3)
            r1.mo3044b(r2)
            java.util.Deque<java.lang.Integer> r0 = r0.f5481h
            r0.clear()
        L4e:
            return
    }
}
