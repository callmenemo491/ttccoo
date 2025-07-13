package p124h7;

/* renamed from: h7.h */
/* loaded from: classes.dex */
public class C2647h {

    /* renamed from: a */
    public volatile p124h7.InterfaceC2935x f11559a;

    /* renamed from: b */
    public volatile p124h7.AbstractC2574cg f11560b;

    static {
            p124h7.C2754mg.m6988a()
            return
    }

    public C2647h() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final int m6764a() {
            r1 = this;
            h7.cg r0 = r1.f11560b
            if (r0 == 0) goto Lc
            h7.cg r0 = r1.f11560b
            h7.bg r0 = (p124h7.C2556bg) r0
            byte[] r0 = r0.f11413a0
            int r0 = r0.length
            return r0
        Lc:
            h7.x r0 = r1.f11559a
            if (r0 == 0) goto L17
            h7.x r0 = r1.f11559a
            int r0 = r0.mo7243k()
            return r0
        L17:
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public final p124h7.AbstractC2574cg m6765b() {
            r1 = this;
            h7.cg r0 = r1.f11560b
            if (r0 == 0) goto L7
            h7.cg r0 = r1.f11560b
            return r0
        L7:
            monitor-enter(r1)
            h7.cg r0 = r1.f11560b     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L10
            h7.cg r0 = r1.f11560b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L10:
            h7.x r0 = r1.f11559a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L19
            h7.cg r0 = p124h7.AbstractC2574cg.f11427Z     // Catch: java.lang.Throwable -> L24
        L16:
            r1.f11560b = r0     // Catch: java.lang.Throwable -> L24
            goto L20
        L19:
            h7.x r0 = r1.f11559a     // Catch: java.lang.Throwable -> L24
            h7.cg r0 = r0.mo7141m()     // Catch: java.lang.Throwable -> L24
            goto L16
        L20:
            h7.cg r0 = r1.f11560b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    /* renamed from: c */
    public final void m6766c(p124h7.InterfaceC2935x r2) {
            r1 = this;
            h7.x r0 = r1.f11559a
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r1)
            h7.x r0 = r1.f11559a     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            r1.f11559a = r2     // Catch: p124h7.C2611f -> L11 java.lang.Throwable -> L1b
            h7.cg r0 = p124h7.AbstractC2574cg.f11427Z     // Catch: p124h7.C2611f -> L11 java.lang.Throwable -> L1b
            r1.f11560b = r0     // Catch: p124h7.C2611f -> L11 java.lang.Throwable -> L1b
            goto L17
        L11:
            r1.f11559a = r2     // Catch: java.lang.Throwable -> L1b
            h7.cg r2 = p124h7.AbstractC2574cg.f11427Z     // Catch: java.lang.Throwable -> L1b
            r1.f11560b = r2     // Catch: java.lang.Throwable -> L1b
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof p124h7.C2647h
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            h7.h r3 = (p124h7.C2647h) r3
            h7.x r0 = r2.f11559a
            h7.x r1 = r3.f11559a
            if (r0 != 0) goto L22
            if (r1 == 0) goto L15
            goto L22
        L15:
            h7.cg r0 = r2.m6765b()
            h7.cg r3 = r3.m6765b()
            boolean r3 = r0.equals(r3)
            return r3
        L22:
            if (r0 == 0) goto L2c
            if (r1 != 0) goto L27
            goto L2c
        L27:
            boolean r3 = r0.equals(r1)
            return r3
        L2c:
            if (r0 == 0) goto L3c
            h7.x r1 = r0.mo7223t()
            r3.m6766c(r1)
            h7.x r3 = r3.f11559a
            boolean r3 = r0.equals(r3)
            return r3
        L3c:
            h7.x r3 = r1.mo7223t()
            r2.m6766c(r3)
            h7.x r3 = r2.f11559a
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }
}
