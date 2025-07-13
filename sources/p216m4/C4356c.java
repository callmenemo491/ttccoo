package p216m4;

/* renamed from: m4.c */
/* loaded from: classes.dex */
public final class C4356c {
    /* renamed from: a */
    public static void m9777a(long r10, p371v5.C6571u r12, p216m4.InterfaceC4381z[] r13) {
        L0:
            int r0 = r12.m13398a()
            r1 = 1
            if (r0 <= r1) goto L6c
            int r0 = m9779c(r12)
            int r2 = m9779c(r12)
            int r3 = r12.f25711b
            int r3 = r3 + r2
            r4 = -1
            if (r2 == r4) goto L5f
            int r4 = r12.m13398a()
            if (r2 <= r4) goto L1c
            goto L5f
        L1c:
            r4 = 4
            if (r0 != r4) goto L68
            r0 = 8
            if (r2 < r0) goto L68
            int r0 = r12.m13418u()
            int r2 = r12.m13423z()
            r4 = 49
            r5 = 0
            if (r2 != r4) goto L35
            int r6 = r12.m13403f()
            goto L36
        L35:
            r6 = 0
        L36:
            int r7 = r12.m13418u()
            r8 = 47
            if (r2 != r8) goto L41
            r12.m13397G(r1)
        L41:
            r9 = 181(0xb5, float:2.54E-43)
            if (r0 != r9) goto L4e
            if (r2 == r4) goto L49
            if (r2 != r8) goto L4e
        L49:
            r0 = 3
            if (r7 != r0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r2 != r4) goto L59
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r6 != r2) goto L57
            goto L58
        L57:
            r1 = 0
        L58:
            r0 = r0 & r1
        L59:
            if (r0 == 0) goto L68
            m9778b(r10, r12, r13)
            goto L68
        L5f:
            java.lang.String r0 = "CeaUtil"
            java.lang.String r1 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r0, r1)
            int r3 = r12.f25712c
        L68:
            r12.m13396F(r3)
            goto L0
        L6c:
            return
    }

    /* renamed from: b */
    public static void m9778b(long r11, p371v5.C6571u r13, p216m4.InterfaceC4381z[] r14) {
            int r0 = r13.m13418u()
            r1 = r0 & 64
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 != 0) goto L10
            return
        L10:
            r0 = r0 & 31
            r13.m13397G(r3)
            int r0 = r0 * 3
            int r1 = r13.f25711b
            int r3 = r14.length
        L1a:
            if (r2 >= r3) goto L38
            r4 = r14[r2]
            r13.m13396F(r1)
            r4.mo5972d(r13, r0)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 == 0) goto L35
            r7 = 1
            r9 = 0
            r10 = 0
            r5 = r11
            r8 = r0
            r4.mo5971c(r5, r7, r8, r9, r10)
        L35:
            int r2 = r2 + 1
            goto L1a
        L38:
            return
    }

    /* renamed from: c */
    public static int m9779c(p371v5.C6571u r3) {
            r0 = 0
        L1:
            int r1 = r3.m13398a()
            if (r1 != 0) goto L9
            r3 = -1
            return r3
        L9:
            int r1 = r3.m13418u()
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L1
            return r0
    }
}
