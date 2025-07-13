package p199l4;

/* renamed from: l4.b */
/* loaded from: classes.dex */
public abstract class AbstractC4179b implements p199l4.C4178a.h {

    /* renamed from: a */
    public final android.support.v4.media.session.MediaSessionCompat f17325a;

    /* renamed from: b */
    public final p088f4.AbstractC2031n1.d f17326b;

    /* renamed from: c */
    public final int f17327c;

    /* renamed from: d */
    public long f17328d;

    public AbstractC4179b(android.support.v4.media.session.MediaSessionCompat r3) {
            r2 = this;
            r2.<init>()
            r2.f17325a = r3
            r3 = 10
            r2.f17327c = r3
            r0 = -1
            r2.f17328d = r0
            f4.n1$d r3 = new f4.n1$d
            r3.<init>()
            r2.f17326b = r3
            return
    }

    @Override // p199l4.C4178a.h
    /* renamed from: a */
    public final void mo9302a(p088f4.InterfaceC2054x0 r6) {
            r5 = this;
            long r0 = r5.f17328d
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            f4.n1 r0 = r6.mo2829M()
            int r0 = r0.mo5180q()
            int r1 = r5.f17327c
            if (r0 <= r1) goto L15
            goto L27
        L15:
            f4.n1 r0 = r6.mo2829M()
            boolean r0 = r0.m5344r()
            if (r0 != 0) goto L2a
            int r6 = r6.mo2824F()
            long r0 = (long) r6
            r5.f17328d = r0
            goto L2a
        L27:
            r5.m9310o(r6)
        L2a:
            return
    }

    @Override // p199l4.C4178a.h
    /* renamed from: b */
    public void mo9303b(p088f4.InterfaceC2054x0 r1) {
            r0 = this;
            r1.mo5223V()
            return
    }

    @Override // p199l4.C4178a.b
    /* renamed from: c */
    public boolean mo7748c(p088f4.InterfaceC2054x0 r1, java.lang.String r2, android.os.Bundle r3, android.os.ResultReceiver r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // p199l4.C4178a.h
    /* renamed from: d */
    public void mo9304d(p088f4.InterfaceC2054x0 r3, long r4) {
            r2 = this;
            f4.n1 r0 = r3.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 != 0) goto L1d
            boolean r1 = r3.mo2840h()
            if (r1 == 0) goto L11
            goto L1d
        L11:
            int r5 = (int) r4
            if (r5 < 0) goto L1d
            int r4 = r0.mo5180q()
            if (r5 >= r4) goto L1d
            r3.mo5233i(r5)
        L1d:
            return
    }

    @Override // p199l4.C4178a.h
    /* renamed from: h */
    public final long mo9305h(p088f4.InterfaceC2054x0 r3) {
            r2 = this;
            long r0 = r2.f17328d
            return r0
    }

    @Override // p199l4.C4178a.h
    /* renamed from: i */
    public void mo9306i(p088f4.InterfaceC2054x0 r1) {
            r0 = this;
            r1.mo5220S()
            return
    }

    @Override // p199l4.C4178a.h
    /* renamed from: l */
    public final void mo9307l(p088f4.InterfaceC2054x0 r1) {
            r0 = this;
            r0.m9310o(r1)
            return
    }

    @Override // p199l4.C4178a.h
    /* renamed from: m */
    public long mo9308m(p088f4.InterfaceC2054x0 r6) {
            r5 = this;
            f4.n1 r0 = r6.mo2829M()
            boolean r1 = r0.m5344r()
            r2 = 0
            if (r1 != 0) goto L58
            boolean r1 = r6.mo2840h()
            if (r1 != 0) goto L58
            int r1 = r6.mo2824F()
            f4.n1$d r3 = r5.f17326b
            r0.m5343o(r1, r3)
            int r0 = r0.mo5180q()
            r1 = 1
            if (r0 <= r1) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            r3 = 5
            boolean r3 = r6.mo5217G(r3)
            if (r3 != 0) goto L3d
            f4.n1$d r3 = r5.f17326b
            boolean r3 = r3.m5355c()
            if (r3 == 0) goto L3d
            r3 = 6
            boolean r3 = r6.mo5217G(r3)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r3 = 0
            goto L3e
        L3d:
            r3 = 1
        L3e:
            f4.n1$d r4 = r5.f17326b
            boolean r4 = r4.m5355c()
            if (r4 == 0) goto L4c
            f4.n1$d r4 = r5.f17326b
            boolean r4 = r4.f9248g0
            if (r4 != 0) goto L54
        L4c:
            r4 = 8
            boolean r6 = r6.mo5217G(r4)
            if (r6 == 0) goto L55
        L54:
            r2 = 1
        L55:
            r6 = r2
            r2 = r0
            goto L5a
        L58:
            r6 = 0
            r3 = 0
        L5a:
            r0 = 0
            if (r2 == 0) goto L60
            r0 = 4096(0x1000, double:2.0237E-320)
        L60:
            if (r3 == 0) goto L65
            r2 = 16
            long r0 = r0 | r2
        L65:
            if (r6 == 0) goto L6a
            r2 = 32
            long r0 = r0 | r2
        L6a:
            return r0
    }

    /* renamed from: n */
    public abstract android.support.v4.media.MediaDescriptionCompat mo9309n(p088f4.InterfaceC2054x0 r1, int r2);

    /* renamed from: o */
    public final void m9310o(p088f4.InterfaceC2054x0 r16) {
            r15 = this;
            r0 = r15
            r1 = r16
            f4.n1 r2 = r16.mo2829M()
            boolean r3 = r2.m5344r()
            if (r3 == 0) goto L1b
            android.support.v4.media.session.MediaSessionCompat r1 = r0.f17325a
            java.util.List r2 = java.util.Collections.emptyList()
            r1.m289f(r2)
            r1 = -1
            r0.f17328d = r1
            return
        L1b:
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            int r4 = r0.f17327c
            int r5 = r2.mo5180q()
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r16.mo2824F()
            android.support.v4.media.session.MediaSessionCompat$QueueItem r6 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            android.support.v4.media.MediaDescriptionCompat r7 = r15.mo9309n(r1, r5)
            long r8 = (long) r5
            r10 = 0
            r6.<init>(r10, r7, r8)
            r3.add(r6)
            boolean r6 = r16.mo2831O()
            r7 = r5
        L41:
            r11 = -1
            if (r5 != r11) goto L46
            if (r7 == r11) goto L80
        L46:
            int r12 = r3.size()
            if (r12 >= r4) goto L80
            r12 = 0
            if (r7 == r11) goto L63
            int r7 = r2.mo5088f(r7, r12, r6)
            if (r7 == r11) goto L62
            android.support.v4.media.session.MediaSessionCompat$QueueItem r13 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            android.support.v4.media.MediaDescriptionCompat r14 = r15.mo9309n(r1, r7)
            long r11 = (long) r7
            r13.<init>(r10, r14, r11)
            r3.add(r13)
        L62:
            r11 = -1
        L63:
            if (r5 == r11) goto L41
            int r12 = r3.size()
            if (r12 >= r4) goto L41
            r12 = 0
            int r5 = r2.mo5091m(r5, r12, r6)
            if (r5 == r11) goto L41
            android.support.v4.media.session.MediaSessionCompat$QueueItem r11 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            android.support.v4.media.MediaDescriptionCompat r12 = r15.mo9309n(r1, r5)
            long r13 = (long) r5
            r11.<init>(r10, r12, r13)
            r3.addFirst(r11)
            goto L41
        L80:
            android.support.v4.media.session.MediaSessionCompat r1 = r0.f17325a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.m289f(r2)
            r0.f17328d = r8
            return
    }
}
