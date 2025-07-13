package p406x4;

/* renamed from: x4.l */
/* loaded from: classes.dex */
public class C6938l extends p142i4.C3072f {
    public C6938l(java.lang.Throwable r3, p406x4.C6939m r4) {
            r2 = this;
            if (r4 != 0) goto L4
            r4 = 0
            goto L6
        L4:
            java.lang.String r4 = r4.f27019a
        L6:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            java.lang.String r1 = "Decoder failed: "
            if (r0 == 0) goto L17
            java.lang.String r4 = r1.concat(r4)
            goto L1c
        L17:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L1c:
            r2.<init>(r4, r3)
            int r4 = p371v5.C6552b0.f25624a
            r0 = 21
            if (r4 < r0) goto L2e
            boolean r4 = r3 instanceof android.media.MediaCodec.CodecException
            if (r4 == 0) goto L2e
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            r3.getDiagnosticInfo()
        L2e:
            return
    }
}
