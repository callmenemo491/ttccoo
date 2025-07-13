package p184k6;

/* renamed from: k6.y */
/* loaded from: classes.dex */
public final class C3722y implements android.os.Parcelable.Creator<p184k6.C3723z> {
    public C3722y() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p184k6.C3723z createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3b
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 1
            if (r6 == r7) goto L36
            r7 = 2
            if (r6 == r7) goto L31
            r7 = 3
            if (r6 == r7) goto L2c
            r7 = 4
            if (r6 == r7) goto L27
            p270p6.C5368b.m11709s(r9, r5)
            goto L9
        L27:
            boolean r2 = p270p6.C5368b.m11700j(r9, r5)
            goto L9
        L2c:
            boolean r1 = p270p6.C5368b.m11700j(r9, r5)
            goto L9
        L31:
            android.os.IBinder r4 = p270p6.C5368b.m11704n(r9, r5)
            goto L9
        L36:
            java.lang.String r3 = p270p6.C5368b.m11695e(r9, r5)
            goto L9
        L3b:
            p270p6.C5368b.m11699i(r9, r0)
            k6.z r9 = new k6.z
            r9.<init>(r3, r4, r1, r2)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p184k6.C3723z[] newArray(int r1) {
            r0 = this;
            k6.z[] r1 = new p184k6.C3723z[r1]
            return r1
    }
}
