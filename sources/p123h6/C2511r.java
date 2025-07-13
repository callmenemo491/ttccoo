package p123h6;

/* renamed from: h6.r */
/* loaded from: classes.dex */
public final class C2511r implements android.os.Parcelable.Creator<p123h6.C2491c> {
    public C2511r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p123h6.C2491c createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = p270p6.C5368b.m11710t(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L1f
            int r2 = r6.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            r4 = 2
            if (r3 == r4) goto L1a
            p270p6.C5368b.m11709s(r6, r2)
            goto L5
        L1a:
            java.lang.String r1 = p270p6.C5368b.m11695e(r6, r2)
            goto L5
        L1f:
            p270p6.C5368b.m11699i(r6, r0)
            h6.c r6 = new h6.c
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p123h6.C2491c[] newArray(int r1) {
            r0 = this;
            h6.c[] r1 = new p123h6.C2491c[r1]
            return r1
    }
}
