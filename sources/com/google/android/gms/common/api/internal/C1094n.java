package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.n */
/* loaded from: classes.dex */
public final class C1094n<T> implements p327s7.InterfaceC5980d<T> {

    /* renamed from: a */
    public final com.google.android.gms.common.api.internal.C1082b f5620a;

    /* renamed from: b */
    public final int f5621b;

    /* renamed from: c */
    public final p218m6.C4388b<?> f5622c;

    /* renamed from: d */
    public final long f5623d;

    public C1094n(com.google.android.gms.common.api.internal.C1082b r1, int r2, p218m6.C4388b<?> r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f5620a = r1
            r0.f5621b = r2
            r0.f5622c = r3
            r0.f5623d = r4
            return
    }

    /* renamed from: b */
    public static p248o6.C4904e m3091b(com.google.android.gms.common.api.internal.C1082b.a<?> r8, int r9) {
            l6.a$e r0 = r8.f5576b
            o6.c r0 = (p248o6.AbstractC4900c) r0
            o6.i0 r0 = r0.f19437u0
            r1 = 0
            if (r0 != 0) goto Lb
            r0 = r1
            goto Ld
        Lb:
            o6.e r0 = r0.f19506b0
        Ld:
            if (r0 == 0) goto L34
            boolean r2 = r0.f19476Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2a
            int[] r2 = r0.f19478b0
            if (r2 == 0) goto L29
            int r5 = r2.length
            r6 = 0
        L1b:
            if (r6 >= r5) goto L26
            r7 = r2[r6]
            if (r7 != r9) goto L23
            r9 = 1
            goto L27
        L23:
            int r6 = r6 + 1
            goto L1b
        L26:
            r9 = 0
        L27:
            if (r9 == 0) goto L2a
        L29:
            r3 = 1
        L2a:
            if (r3 != 0) goto L2d
            goto L34
        L2d:
            int r8 = r8.f5586l
            int r9 = r0.f19479c0
            if (r8 >= r9) goto L34
            return r0
        L34:
            return r1
    }

    @Override // p327s7.InterfaceC5980d
    /* renamed from: a */
    public final void mo3092a(p327s7.AbstractC5985i<T> r23) {
            r22 = this;
            r0 = r22
            com.google.android.gms.common.api.internal.b r1 = r0.f5620a
            boolean r1 = r1.m3059f()
            if (r1 != 0) goto Lb
            return
        Lb:
            long r1 = r0.f5623d
            r3 = 0
            r5 = 1
            r6 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            o6.p r2 = p248o6.C4926p.m11076a()
            o6.q r2 = r2.f19532a
            r7 = 100
            if (r2 == 0) goto L67
            boolean r8 = r2.f19534Z
            if (r8 != 0) goto L27
            return
        L27:
            boolean r8 = r2.f19535a0
            r1 = r1 & r8
            int r8 = r2.f19536b0
            int r9 = r2.f19537c0
            int r2 = r2.f19533Y
            com.google.android.gms.common.api.internal.b r10 = r0.f5620a
            m6.b<?> r11 = r0.f5622c
            java.util.Map<m6.b<?>, com.google.android.gms.common.api.internal.b$a<?>> r10 = r10.f5570h0
            java.lang.Object r10 = r10.get(r11)
            com.google.android.gms.common.api.internal.b$a r10 = (com.google.android.gms.common.api.internal.C1082b.a) r10
            if (r10 == 0) goto L64
            l6.a$e r11 = r10.f5576b
            boolean r11 = r11.mo9314a()
            if (r11 == 0) goto L64
            l6.a$e r11 = r10.f5576b
            boolean r11 = r11 instanceof p248o6.AbstractC4900c
            if (r11 == 0) goto L64
            int r1 = r0.f5621b
            o6.e r1 = m3091b(r10, r1)
            if (r1 != 0) goto L55
            return
        L55:
            boolean r9 = r1.f19477a0
            if (r9 == 0) goto L60
            long r9 = r0.f5623d
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L60
            goto L61
        L60:
            r5 = 0
        L61:
            int r9 = r1.f19479c0
            r1 = r5
        L64:
            r10 = r2
            r13 = r9
            goto L6c
        L67:
            r8 = 5000(0x1388, float:7.006E-42)
            r10 = 0
            r13 = 100
        L6c:
            com.google.android.gms.common.api.internal.b r2 = r0.f5620a
            boolean r5 = r23.mo12455m()
            r9 = -1
            if (r5 == 0) goto L7a
            r16 = 0
            r17 = 0
            goto La6
        L7a:
            boolean r5 = r23.mo12453k()
            if (r5 == 0) goto L83
            r6 = 100
            goto La2
        L83:
            java.lang.Exception r5 = r23.mo12450h()
            boolean r6 = r5 instanceof p201l6.C4182b
            if (r6 == 0) goto L9e
            l6.b r5 = (p201l6.C4182b) r5
            com.google.android.gms.common.api.Status r5 = r5.f17345Y
            int r6 = r5.f5536Z
            k6.b r5 = r5.f5539c0
            if (r5 != 0) goto L97
            r5 = -1
            goto L99
        L97:
            int r5 = r5.f16394Z
        L99:
            r17 = r5
            r16 = r6
            goto La6
        L9e:
            r5 = 101(0x65, float:1.42E-43)
            r6 = 101(0x65, float:1.42E-43)
        La2:
            r16 = r6
            r17 = -1
        La6:
            if (r1 == 0) goto Lb3
            long r3 = r0.f5623d
            long r5 = java.lang.System.currentTimeMillis()
            r18 = r3
            r20 = r5
            goto Lb7
        Lb3:
            r18 = r3
            r20 = r18
        Lb7:
            o6.b0 r9 = new o6.b0
            int r15 = r0.f5621b
            r14 = r9
            r14.<init>(r15, r16, r17, r18, r20)
            long r11 = (long) r8
            android.os.Handler r1 = r2.f5573k0
            m6.o r2 = new m6.o
            r8 = r2
            r8.<init>(r9, r10, r11, r13)
            r3 = 18
            android.os.Message r2 = r1.obtainMessage(r3, r2)
            r1.sendMessage(r2)
            return
    }
}
