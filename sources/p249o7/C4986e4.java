package p249o7;

/* renamed from: o7.e4 */
/* loaded from: classes.dex */
public final class C4986e4 extends java.lang.Thread {

    /* renamed from: Y */
    public final java.lang.Object f19660Y;

    /* renamed from: Z */
    public final java.util.concurrent.BlockingQueue<p249o7.C4978d4<?>> f19661Z;

    /* renamed from: a0 */
    public boolean f19662a0;

    /* renamed from: b0 */
    public final /* synthetic */ p249o7.C4994f4 f19663b0;

    public C4986e4(p249o7.C4994f4 r1, java.lang.String r2, java.util.concurrent.BlockingQueue<p249o7.C4978d4<?>> r3) {
            r0 = this;
            r0.f19663b0 = r1
            r0.<init>()
            r1 = 0
            r0.f19662a0 = r1
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r3, r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f19660Y = r1
            r0.f19661Z = r3
            r0.setName(r2)
            return
    }

    /* renamed from: a */
    public final void m11145a() {
            r4 = this;
            o7.f4 r0 = r4.f19663b0
            java.lang.Object r0 = r0.f19682i
            monitor-enter(r0)
            boolean r1 = r4.f19662a0     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L38
            o7.f4 r1 = r4.f19663b0     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.Semaphore r1 = r1.f19683j     // Catch: java.lang.Throwable -> L3a
            r1.release()     // Catch: java.lang.Throwable -> L3a
            o7.f4 r1 = r4.f19663b0     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.f19682i     // Catch: java.lang.Throwable -> L3a
            r1.notifyAll()     // Catch: java.lang.Throwable -> L3a
            o7.f4 r1 = r4.f19663b0     // Catch: java.lang.Throwable -> L3a
            o7.e4 r2 = r1.f19676c     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            if (r4 != r2) goto L21
            r1.f19676c = r3     // Catch: java.lang.Throwable -> L3a
            goto L35
        L21:
            o7.e4 r2 = r1.f19677d     // Catch: java.lang.Throwable -> L3a
            if (r4 != r2) goto L28
            r1.f19677d = r3     // Catch: java.lang.Throwable -> L3a
            goto L35
        L28:
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L3a
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r1.m11169c(r2)     // Catch: java.lang.Throwable -> L3a
        L35:
            r1 = 1
            r4.f19662a0 = r1     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    /* renamed from: b */
    public final void m11146b(java.lang.InterruptedException r4) {
            r3 = this;
            o7.f4 r0 = r3.f19663b0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = r3.getName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " was interrupted"
            java.lang.String r1 = r1.concat(r2)
            r0.m11170d(r1, r4)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r6 = this;
            r0 = 1
            r1 = 0
        L2:
            if (r1 != 0) goto L12
            o7.f4 r2 = r6.f19663b0     // Catch: java.lang.InterruptedException -> Ld
            java.util.concurrent.Semaphore r2 = r2.f19683j     // Catch: java.lang.InterruptedException -> Ld
            r2.acquire()     // Catch: java.lang.InterruptedException -> Ld
            r1 = 1
            goto L2
        Ld:
            r2 = move-exception
            r6.m11146b(r2)
            goto L2
        L12:
            int r1 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L7c
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch: java.lang.Throwable -> L7c
        L1a:
            java.util.concurrent.BlockingQueue<o7.d4<?>> r2 = r6.f19661Z     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L7c
            o7.d4 r2 = (p249o7.C4978d4) r2     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L33
            boolean r3 = r2.f19629Z     // Catch: java.lang.Throwable -> L7c
            if (r0 == r3) goto L2b
            r3 = 10
            goto L2c
        L2b:
            r3 = r1
        L2c:
            android.os.Process.setThreadPriority(r3)     // Catch: java.lang.Throwable -> L7c
            r2.run()     // Catch: java.lang.Throwable -> L7c
            goto L1a
        L33:
            java.lang.Object r2 = r6.f19660Y     // Catch: java.lang.Throwable -> L7c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7c
            java.util.concurrent.BlockingQueue<o7.d4<?>> r3 = r6.f19661Z     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L4f
            o7.f4 r3 = r6.f19663b0     // Catch: java.lang.Throwable -> L79
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r6.f19660Y     // Catch: java.lang.InterruptedException -> L4b java.lang.Throwable -> L79
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch: java.lang.InterruptedException -> L4b java.lang.Throwable -> L79
            goto L4f
        L4b:
            r3 = move-exception
            r6.m11146b(r3)     // Catch: java.lang.Throwable -> L79
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            o7.f4 r2 = r6.f19663b0     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r2.f19682i     // Catch: java.lang.Throwable -> L7c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7c
            java.util.concurrent.BlockingQueue<o7.d4<?>> r3 = r6.f19661Z     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L74
            o7.f4 r0 = r6.f19663b0     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.Throwable -> L76
            o7.f r0 = r0.f5716g     // Catch: java.lang.Throwable -> L76
            o7.u2<java.lang.Boolean> r1 = p249o7.C5120v2.f20103k0     // Catch: java.lang.Throwable -> L76
            r3 = 0
            boolean r0 = r0.m11162v(r3, r1)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L6f
            r6.m11145a()     // Catch: java.lang.Throwable -> L76
        L6f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            r6.m11145a()
            return
        L74:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            goto L1a
        L76:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L7c
        L79:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L7c
        L7c:
            r0 = move-exception
            r6.m11145a()
            throw r0
    }
}
