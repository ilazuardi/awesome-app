package com.irfan.awesomeapp.core.data.source.local.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PhotoDao_Impl implements PhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PhotoEntity> __insertionAdapterOfPhotoEntity;

  public PhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPhotoEntity = new EntityInsertionAdapter<PhotoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `photo` (`photoId`,`width`,`height`,`photographer`,`photographerUrl`,`avgColor`,`url`,`tinyUrl`,`portraitUrl`,`landscapeUrl`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PhotoEntity value) {
        stmt.bindLong(1, value.getPhotoId());
        stmt.bindLong(2, value.getWidth());
        stmt.bindLong(3, value.getHeight());
        if (value.getPhotographer() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhotographer());
        }
        if (value.getPhotographerUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhotographerUrl());
        }
        if (value.getAvgColor() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAvgColor());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrl());
        }
        if (value.getTinyUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTinyUrl());
        }
        if (value.getPortraitUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPortraitUrl());
        }
        if (value.getLandscapeUrl() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLandscapeUrl());
        }
      }
    };
  }

  @Override
  public void insertPhoto(final List<PhotoEntity> photos) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPhotoEntity.insert(photos);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<PhotoEntity>> getAllPhoto() {
    final String _sql = "SELECT * FROM photo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"photo"}, false, new Callable<List<PhotoEntity>>() {
      @Override
      public List<PhotoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPhotoId = CursorUtil.getColumnIndexOrThrow(_cursor, "photoId");
          final int _cursorIndexOfWidth = CursorUtil.getColumnIndexOrThrow(_cursor, "width");
          final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
          final int _cursorIndexOfPhotographer = CursorUtil.getColumnIndexOrThrow(_cursor, "photographer");
          final int _cursorIndexOfPhotographerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "photographerUrl");
          final int _cursorIndexOfAvgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "avgColor");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfTinyUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "tinyUrl");
          final int _cursorIndexOfPortraitUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "portraitUrl");
          final int _cursorIndexOfLandscapeUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "landscapeUrl");
          final List<PhotoEntity> _result = new ArrayList<PhotoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PhotoEntity _item;
            final int _tmpPhotoId;
            _tmpPhotoId = _cursor.getInt(_cursorIndexOfPhotoId);
            final int _tmpWidth;
            _tmpWidth = _cursor.getInt(_cursorIndexOfWidth);
            final int _tmpHeight;
            _tmpHeight = _cursor.getInt(_cursorIndexOfHeight);
            final String _tmpPhotographer;
            if (_cursor.isNull(_cursorIndexOfPhotographer)) {
              _tmpPhotographer = null;
            } else {
              _tmpPhotographer = _cursor.getString(_cursorIndexOfPhotographer);
            }
            final String _tmpPhotographerUrl;
            if (_cursor.isNull(_cursorIndexOfPhotographerUrl)) {
              _tmpPhotographerUrl = null;
            } else {
              _tmpPhotographerUrl = _cursor.getString(_cursorIndexOfPhotographerUrl);
            }
            final String _tmpAvgColor;
            if (_cursor.isNull(_cursorIndexOfAvgColor)) {
              _tmpAvgColor = null;
            } else {
              _tmpAvgColor = _cursor.getString(_cursorIndexOfAvgColor);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpTinyUrl;
            if (_cursor.isNull(_cursorIndexOfTinyUrl)) {
              _tmpTinyUrl = null;
            } else {
              _tmpTinyUrl = _cursor.getString(_cursorIndexOfTinyUrl);
            }
            final String _tmpPortraitUrl;
            if (_cursor.isNull(_cursorIndexOfPortraitUrl)) {
              _tmpPortraitUrl = null;
            } else {
              _tmpPortraitUrl = _cursor.getString(_cursorIndexOfPortraitUrl);
            }
            final String _tmpLandscapeUrl;
            if (_cursor.isNull(_cursorIndexOfLandscapeUrl)) {
              _tmpLandscapeUrl = null;
            } else {
              _tmpLandscapeUrl = _cursor.getString(_cursorIndexOfLandscapeUrl);
            }
            _item = new PhotoEntity(_tmpPhotoId,_tmpWidth,_tmpHeight,_tmpPhotographer,_tmpPhotographerUrl,_tmpAvgColor,_tmpUrl,_tmpTinyUrl,_tmpPortraitUrl,_tmpLandscapeUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
