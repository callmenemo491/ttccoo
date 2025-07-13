package p377vd;

/* renamed from: vd.s */
/* loaded from: classes.dex */
public final class CountDownTimerC6650s extends android.os.CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ p377vd.C6648q f25857a;

    public CountDownTimerC6650s(p377vd.C6648q r3, long r4) {
            r2 = this;
            r2.f25857a = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.<init>(r4, r0)
            return
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
            r8 = this;
            vd.q r0 = r8.f25857a
            androidx.lifecycle.d0<vd.t> r0 = r0.f25841g
            vd.t r7 = new vd.t
            r2 = 1
            java.lang.String r3 = "Claim"
            r4 = 0
            r5 = 0
            r6 = 12
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.mo7l(r7)
            return
    }

    @Override // android.os.CountDownTimer
    public void onTick(long r9) {
            r8 = this;
            vd.q r0 = r8.f25857a
            androidx.lifecycle.d0<vd.t> r0 = r0.f25841g
            r1 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r1
            long r9 = r9 / r1
            vd.t r1 = new vd.t
            r2 = 60
            long r2 = (long) r2
            long r4 = r9 / r2
            long r2 = r9 % r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            r6 = 2
            r7 = 0
            if (r3 < r6) goto L27
            java.lang.String r2 = r2.substring(r7, r6)
            java.lang.String r3 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r2, r3)
            goto L38
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = 48
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r4 = 58
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 100
            long r4 = (long) r3
            long r4 = r4 * r9
            r9 = 3600(0xe10, float:5.045E-42)
            long r9 = (long) r9
            long r4 = r4 / r9
            int r9 = (int) r4
            int r9 = p209lh.C4304a.m9616j(r9, r7, r3)
            java.lang.String r10 = "Claim"
            r1.<init>(r7, r10, r2, r9)
            r0.mo7l(r1)
            return
    }
}
