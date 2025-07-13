package p454zc;

/* renamed from: zc.p */
/* loaded from: classes.dex */
public class C7292p extends android.view.OrientationEventListener {

    /* renamed from: a */
    public final /* synthetic */ p454zc.C7293q f27958a;

    public C7292p(p454zc.C7293q r1, android.content.Context r2, int r3) {
            r0 = this;
            r0.f27958a = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int r5) {
            r4 = this;
            zc.q r5 = r4.f27958a
            android.view.WindowManager r0 = r5.f27960b
            zc.o r5 = r5.f27962d
            if (r0 == 0) goto L2a
            if (r5 == 0) goto L2a
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            zc.q r1 = r4.f27958a
            int r2 = r1.f27959a
            if (r0 == r2) goto L2a
            r1.f27959a = r0
            com.journeyapps.barcodescanner.a$c r5 = (com.journeyapps.barcodescanner.C1253a.c) r5
            com.journeyapps.barcodescanner.a r0 = r5.f6713a
            android.os.Handler r0 = r0.f6687c0
            f1.f r1 = new f1.f
            r1.<init>(r5)
            r2 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r1, r2)
        L2a:
            return
    }
}
