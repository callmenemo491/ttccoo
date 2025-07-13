package p142i4;

import p142i4.AbstractC3074h;
import p142i4.C3072f;
import p142i4.C3073g;

/* renamed from: i4.j */
/* loaded from: classes.dex */
public abstract class AbstractC3076j<I extends p142i4.C3073g, O extends p142i4.AbstractC3074h, E extends p142i4.C3072f> implements p142i4.InterfaceC3070d<I, O, E> {

    /* renamed from: a */
    public final java.lang.Thread f12370a;

    /* renamed from: b */
    public final java.lang.Object f12371b;

    /* renamed from: c */
    public final java.util.ArrayDeque<I> f12372c;

    /* renamed from: d */
    public final java.util.ArrayDeque<O> f12373d;

    /* renamed from: e */
    public final I[] f12374e;

    /* renamed from: f */
    public final O[] f12375f;

    /* renamed from: g */
    public int f12376g;

    /* renamed from: h */
    public int f12377h;

    /* renamed from: i */
    public I f12378i;

    /* renamed from: j */
    public E f12379j;

    /* renamed from: k */
    public boolean f12380k;

    /* renamed from: l */
    public boolean f12381l;

    /* renamed from: m */
    public int f12382m;

    /* renamed from: i4.j$a */
    public class a extends java.lang.Thread {

        /* renamed from: Y */
        public final /* synthetic */ p142i4.AbstractC3076j f12383Y;

        public a(p142i4.AbstractC3076j r1, java.lang.String r2) {
                r0 = this;
                r0.f12383Y = r1
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
                i4.j r0 = r2.f12383Y
                java.util.Objects.requireNonNull(r0)
            L5:
                boolean r1 = r0.m7529f()     // Catch: java.lang.InterruptedException -> Ld
                if (r1 == 0) goto Lc
                goto L5
            Lc:
                return
            Ld:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }
    }

    public AbstractC3076j(I[] r4, O[] r5) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f12371b = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.f12372c = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.f12373d = r0
            r3.f12374e = r4
            int r4 = r4.length
            r3.f12376g = r4
            r4 = 0
            r0 = 0
        L1f:
            int r1 = r3.f12376g
            if (r0 >= r1) goto L2f
            I extends i4.g[] r1 = r3.f12374e
            i5.j r2 = new i5.j
            r2.<init>()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1f
        L2f:
            r3.f12375f = r5
            int r5 = r5.length
            r3.f12377h = r5
        L34:
            int r5 = r3.f12377h
            if (r4 >= r5) goto L47
            O extends i4.h[] r5 = r3.f12375f
            r0 = r3
            i5.e r0 = (p143i5.AbstractC3081e) r0
            i5.d r1 = new i5.d
            r1.<init>(r0)
            r5[r4] = r1
            int r4 = r4 + 1
            goto L34
        L47:
            i4.j$a r4 = new i4.j$a
            java.lang.String r5 = "ExoPlayer:SimpleDecoder"
            r4.<init>(r3, r5)
            r3.f12370a = r4
            r4.start()
            return
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: b */
    public void mo7519b(java.lang.Object r3) {
            r2 = this;
            i4.g r3 = (p142i4.C3073g) r3
            java.lang.Object r0 = r2.f12371b
            monitor-enter(r0)
            r2.m7531h()     // Catch: java.lang.Throwable -> L1f
            I extends i4.g r1 = r2.f12378i     // Catch: java.lang.Throwable -> L1f
            if (r3 != r1) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            p371v5.C6549a.m13288b(r1)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque<I extends i4.g> r1 = r2.f12372c     // Catch: java.lang.Throwable -> L1f
            r1.addLast(r3)     // Catch: java.lang.Throwable -> L1f
            r2.m7530g()     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r2.f12378i = r3     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: c */
    public java.lang.Object mo7520c() {
            r2 = this;
            java.lang.Object r0 = r2.f12371b
            monitor-enter(r0)
            r2.m7531h()     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayDeque<O extends i4.h> r1 = r2.f12373d     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L11
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L1a
        L11:
            java.util.ArrayDeque<O extends i4.h> r1 = r2.f12373d     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L1b
            i4.h r1 = (p142i4.AbstractC3074h) r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
        L1a:
            return r1
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    @Override // p142i4.InterfaceC3070d
    /* renamed from: d */
    public java.lang.Object mo7521d() {
            r4 = this;
            java.lang.Object r0 = r4.f12371b
            monitor-enter(r0)
            r4.m7531h()     // Catch: java.lang.Throwable -> L22
            I extends i4.g r1 = r4.f12378i     // Catch: java.lang.Throwable -> L22
            r2 = 1
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            p371v5.C6549a.m13291e(r1)     // Catch: java.lang.Throwable -> L22
            int r1 = r4.f12376g     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L17
            r1 = 0
            goto L1e
        L17:
            I extends i4.g[] r3 = r4.f12374e     // Catch: java.lang.Throwable -> L22
            int r1 = r1 - r2
            r4.f12376g = r1     // Catch: java.lang.Throwable -> L22
            r1 = r3[r1]     // Catch: java.lang.Throwable -> L22
        L1e:
            r4.f12378i = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    /* renamed from: e */
    public abstract E mo7528e(I r1, O r2, boolean r3);

    /* renamed from: f */
    public final boolean m7529f() {
            r7 = this;
            java.lang.Object r0 = r7.f12371b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.f12381l     // Catch: java.lang.Throwable -> L9b
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L20
            java.util.ArrayDeque<I extends i4.g> r1 = r7.f12372c     // Catch: java.lang.Throwable -> L9b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L17
            int r1 = r7.f12377h     // Catch: java.lang.Throwable -> L9b
            if (r1 <= 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 != 0) goto L20
            java.lang.Object r1 = r7.f12371b     // Catch: java.lang.Throwable -> L9b
            r1.wait()     // Catch: java.lang.Throwable -> L9b
            goto L3
        L20:
            boolean r1 = r7.f12381l     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r2
        L26:
            java.util.ArrayDeque<I extends i4.g> r1 = r7.f12372c     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L9b
            i4.g r1 = (p142i4.C3073g) r1     // Catch: java.lang.Throwable -> L9b
            O extends i4.h[] r4 = r7.f12375f     // Catch: java.lang.Throwable -> L9b
            int r5 = r7.f12377h     // Catch: java.lang.Throwable -> L9b
            int r5 = r5 - r3
            r7.f12377h = r5     // Catch: java.lang.Throwable -> L9b
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L9b
            boolean r5 = r7.f12380k     // Catch: java.lang.Throwable -> L9b
            r7.f12380k = r2     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r1.m7517r()
            if (r0 == 0) goto L47
            r0 = 4
            r4.m7513l(r0)
            goto L75
        L47:
            boolean r0 = r1.m7516q()
            if (r0 == 0) goto L52
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.m7513l(r0)
        L52:
            i4.f r0 = r7.mo7528e(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L57 java.lang.RuntimeException -> L60
            goto L69
        L57:
            r0 = move-exception
            i5.h r5 = new i5.h
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L68
        L60:
            r0 = move-exception
            i5.h r5 = new i5.h
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L68:
            r0 = r5
        L69:
            if (r0 == 0) goto L75
            java.lang.Object r5 = r7.f12371b
            monitor-enter(r5)
            r7.f12379j = r0     // Catch: java.lang.Throwable -> L72
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L72
            return r2
        L72:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L72
            throw r0
        L75:
            java.lang.Object r5 = r7.f12371b
            monitor-enter(r5)
            boolean r0 = r7.f12380k     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L7d
            goto L88
        L7d:
            boolean r0 = r4.m7516q()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L8c
            int r0 = r7.f12382m     // Catch: java.lang.Throwable -> L98
            int r0 = r0 + r3
            r7.f12382m = r0     // Catch: java.lang.Throwable -> L98
        L88:
            r4.mo7527t()     // Catch: java.lang.Throwable -> L98
            goto L93
        L8c:
            r7.f12382m = r2     // Catch: java.lang.Throwable -> L98
            java.util.ArrayDeque<O extends i4.h> r0 = r7.f12373d     // Catch: java.lang.Throwable -> L98
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L98
        L93:
            r7.m7532i(r1)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L98
            return r3
        L98:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L98
            throw r0
        L9b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r1
    }

    @Override // p142i4.InterfaceC3070d
    public final void flush() {
            r2 = this;
            java.lang.Object r0 = r2.f12371b
            monitor-enter(r0)
            r1 = 1
            r2.f12380k = r1     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            r2.f12382m = r1     // Catch: java.lang.Throwable -> L3d
            I extends i4.g r1 = r2.f12378i     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L13
            r2.m7532i(r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            r2.f12378i = r1     // Catch: java.lang.Throwable -> L3d
        L13:
            java.util.ArrayDeque<I extends i4.g> r1 = r2.f12372c     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L27
            java.util.ArrayDeque<I extends i4.g> r1 = r2.f12372c     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L3d
            i4.g r1 = (p142i4.C3073g) r1     // Catch: java.lang.Throwable -> L3d
            r2.m7532i(r1)     // Catch: java.lang.Throwable -> L3d
            goto L13
        L27:
            java.util.ArrayDeque<O extends i4.h> r1 = r2.f12373d     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3b
            java.util.ArrayDeque<O extends i4.h> r1 = r2.f12373d     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L3d
            i4.h r1 = (p142i4.AbstractC3074h) r1     // Catch: java.lang.Throwable -> L3d
            r1.mo7527t()     // Catch: java.lang.Throwable -> L3d
            goto L27
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r1
    }

    /* renamed from: g */
    public final void m7530g() {
            r1 = this;
            java.util.ArrayDeque<I extends i4.g> r0 = r1.f12372c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            int r0 = r1.f12377h
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.f12371b
            r0.notify()
        L16:
            return
    }

    /* renamed from: h */
    public final void m7531h() {
            r1 = this;
            E extends i4.f r0 = r1.f12379j
            if (r0 != 0) goto L5
            return
        L5:
            throw r0
    }

    /* renamed from: i */
    public final void m7532i(I r4) {
            r3 = this;
            r4.mo7522t()
            I extends i4.g[] r0 = r3.f12374e
            int r1 = r3.f12376g
            int r2 = r1 + 1
            r3.f12376g = r2
            r0[r1] = r4
            return
    }

    @Override // p142i4.InterfaceC3070d
    public void release() {
            r2 = this;
            java.lang.Object r0 = r2.f12371b
            monitor-enter(r0)
            r1 = 1
            r2.f12381l = r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r2.f12371b     // Catch: java.lang.Throwable -> L1a
            r1.notify()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Thread r0 = r2.f12370a     // Catch: java.lang.InterruptedException -> L12
            r0.join()     // Catch: java.lang.InterruptedException -> L12
            goto L19
        L12:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }
}
