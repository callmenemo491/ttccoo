package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver */
/* loaded from: classes.dex */
public class C1041xe42a8fb1 extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f5235a = 0;

    public C1041xe42a8fb1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            android.net.Uri r0 = r6.getData()
            java.lang.String r1 = "backendName"
            java.lang.String r0 = r0.getQueryParameter(r1)
            android.net.Uri r1 = r6.getData()
            java.lang.String r2 = "extras"
            java.lang.String r1 = r1.getQueryParameter(r2)
            android.net.Uri r2 = r6.getData()
            java.lang.String r3 = "priority"
            java.lang.String r2 = r2.getQueryParameter(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            android.os.Bundle r6 = r6.getExtras()
            java.lang.String r3 = "attemptNumber"
            int r6 = r6.getInt(r3)
            p385w3.C6791m.m13811b(r5)
            w3.i$a r5 = p385w3.AbstractC6787i.m13808a()
            r5.mo13802b(r0)
            t3.d r0 = p069e4.C1515a.m4104b(r2)
            r5.mo13803c(r0)
            if (r1 == 0) goto L4d
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)
            r1 = r5
            w3.b$b r1 = (p385w3.C6780b.b) r1
            r1.f26322b = r0
        L4d:
            w3.m r0 = p385w3.C6791m.m13810a()
            a4.i r0 = r0.f26346d
            w3.i r5 = r5.mo13801a()
            a4.a r1 = p005a4.RunnableC0012a.f12Y
            java.util.concurrent.Executor r2 = r0.f41e
            a4.h r3 = new a4.h
            r3.<init>(r0, r5, r6, r1)
            r2.execute(r3)
            return
    }
}
